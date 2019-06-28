package com.ayudape.developer.chatbot.api;

import com.ayudape.developer.chatbot.model.Feedback;
import com.ayudape.developer.chatbot.model.Message;
import com.ayudape.developer.chatbot.service.FeedbackService;
import com.ayudape.developer.chatbot.service.MessageService;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import java.util.UUID;

@RestController
public class MessageController {

    private final MessageService messageService;
    private final Assistant assistantService;
    private final FeedbackService feedbackService;

    @Autowired
    private MessageController(MessageService messageService, FeedbackService feedbackService) {
        IamOptions options = new IamOptions.Builder().apiKey("rS0J-FJmKIrLKk6yUoM6tBffDaCNnoCWQCG-DBOo-EvZ").build();
        this.messageService = messageService;
        this.assistantService = new Assistant("2019-06-04");
        this.assistantService.setIamCredentials(options);
        this.assistantService.setEndPoint("https://gateway.watsonplatform.net/assistant/api");
        this.feedbackService = feedbackService;
    }

    @PostMapping(
            value="/ask-question",
            consumes="application/json",
            produces="application/json")
    public MessageResponse askQuestion(@RequestBody Message message) {

        UUID a = UUID.randomUUID();
        Message messageToBeSaved = new Message(a,message.getText(),Boolean.FALSE,message.getImage());
        messageService.save(messageToBeSaved);

        MessageInput input = new MessageInput.Builder()
                .text(message.getText())
                .build();
        CreateSessionOptions createSessionOptions = new CreateSessionOptions.Builder("d03aae8d-1f0c-4867-841a-7dd29f5d7ae9").build();
        SessionResponse session = assistantService.createSession(createSessionOptions).execute().getResult();
        String sessionId = session.getSessionId();
        MessageOptions messageOptions = new MessageOptions.Builder()
                .assistantId("d03aae8d-1f0c-4867-841a-7dd29f5d7ae9")
                .sessionId(sessionId)
                .input(input)
                .build();
        MessageResponse response = this.assistantService.message(messageOptions).execute().getResult();
        List<RuntimeIntent> intents = response.getOutput().getIntents();

        if(intents.size() == 0)
        {
            Feedback nonAnsweredQuestion = new Feedback(message.getText());
            feedbackService.save(nonAnsweredQuestion);
        }
        else
        {
            String intent = response.getOutput().getIntents().get(0).getIntent();
            if(intent.equals("Feedback")) {
                Feedback nonAnsweredQuestion = new Feedback(message.getText());
                feedbackService.save(nonAnsweredQuestion);
            }
        }

        List<DialogRuntimeResponseGeneric> responseMessages = response.getOutput().getGeneric();
        for (DialogRuntimeResponseGeneric responseMessage:responseMessages)
        {
            Message responseToBeSaved = new Message(a,responseMessage.getText(),Boolean.TRUE,responseMessage.getSource());
            messageService.save(responseToBeSaved);
        }
        return response;
    }

    @RequestMapping(value = "/saveM", method = RequestMethod.GET)
    public boolean save() {
        UUID a = UUID.randomUUID();
        Message message = new Message(a,"hola",Boolean.FALSE,"");
        List<Message> test = messageService.getFromUser(a);
        System.out.println(test.size());
        for(int i = 0; i < test.size();i++)
        {
            System.out.println(test.get(i).getText());
        }
        return messageService.save(message);
    }
}
