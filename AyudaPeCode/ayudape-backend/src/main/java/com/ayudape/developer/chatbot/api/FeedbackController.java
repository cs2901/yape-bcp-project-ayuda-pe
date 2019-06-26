package com.ayudape.developer.chatbot.api;

import com.ayudape.developer.chatbot.model.Feedback;
import com.ayudape.developer.chatbot.service.FeedbackService;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.assistant.v2.Assistant;
import com.ibm.watson.assistant.v2.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import java.util.UUID;

@RestController
public class FeedbackController {
    private final FeedbackService feedbackService;
    private final Assistant assistantService;

    @Autowired
    private FeedbackController(FeedbackService feedbackService) {
        IamOptions options = new IamOptions.Builder().apiKey("rS0J-FJmKIrLKk6yUoM6tBffDaCNnoCWQCG-DBOo-EvZ").build();
        this.feedbackService = feedbackService;
        this.assistantService = new Assistant("2019-06-04");
        this.assistantService.setIamCredentials(options);
        this.assistantService.setEndPoint("https://gateway.watsonplatform.net/assistant/api");
    }

    @PostMapping(
            value="/send-feedback",
            consumes="application/json",
            produces="application/json")
    public boolean sendFeedback(@RequestBody Feedback feedback) {
        MessageInput input = new MessageInput.Builder()
                .text(feedback.getQuestion())
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
        String tag  = response.getOutput().getIntents().get(0).getIntent();
        Feedback feedbackToBeSaved = new Feedback(feedback.getQuestion(),tag,feedback.getType(),feedback.getComment());
        return feedbackService.save(feedbackToBeSaved);
    }
}
