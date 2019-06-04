package com.ayudape.developer.chatbot.api;

import com.ayudape.developer.chatbot.service.MessageService;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageService messageService;
    private final Assistant assistantService;

    @Autowired
    private MessageController(MessageService messageService) {
        IamOptions options = new IamOptions.Builder().apiKey("bgtiMVJSFM3WBoWH3fDBftLzS4he-_4JQ2kSrnncQIbl").build();
        this.messageService = messageService;
        this.assistantService = new Assistant("2019-06-04");
        this.assistantService.setIamCredentials(options);
        this.assistantService.setEndPoint("https://gateway.watsonplatform.net/assistant/api");
        MessageInput input = new MessageInput.Builder()
                .text("Hi")
                .build();
        CreateSessionOptions createSessionOptions = new CreateSessionOptions.Builder("e0506bb0-d817-491f-b398-54828940638a").build();
        SessionResponse session = assistantService.createSession(createSessionOptions).execute().getResult();
        String sessionId = session.getSessionId();
        MessageOptions messageOptions = new MessageOptions.Builder()
                .assistantId("e0506bb0-d817-491f-b398-54828940638a")
                .sessionId(sessionId)
                .input(input)
                .build();
        MessageResponse messageResponse = this.assistantService.message(messageOptions).execute().getResult();

        System.out.println(messageResponse);
    }
}
