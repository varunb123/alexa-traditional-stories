package com.varun.alexa.stories.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.handler.GenericRequestHandler;

import java.util.Optional;
import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Welcome to Traditional Indian Stories. You can listen to a story by saying, tell me a story";
        String repromptText = "You can listen to a story by saying, tell me a story";
        return input.getResponseBuilder()
                .withSimpleCard("StorySession", speechText)
                .withSpeech(speechText)
                .withReprompt(repromptText)
                .build();
    }

}
