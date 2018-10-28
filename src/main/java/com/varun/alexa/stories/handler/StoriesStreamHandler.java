package com.varun.alexa.stories.handler;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

public class StoriesStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new StoriesIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                .withSkillId("amzn1.ask.skill.0fae67a0-96d4-4df7-b124-a63d3d6d63cc")
                .build();
    }

    public StoriesStreamHandler() {
        super(getSkill());
    }

}
