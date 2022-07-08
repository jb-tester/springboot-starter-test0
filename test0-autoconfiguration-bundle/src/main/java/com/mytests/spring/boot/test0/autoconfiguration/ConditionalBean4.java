package com.mytests.spring.boot.test0.autoconfiguration;

/**
 * *
 * <p>Created by irina on 2/22/2022.</p>
 * <p>Project: springboot-starter-test0</p>
 * *
 */
public class ConditionalBean4 {
    private final ConditionalBean3 condition;

    public ConditionalBean4(ConditionalBean3 conditionalBean3) {
        this.condition = conditionalBean3;
    }

    public ConditionalBean3 getCondition() {
        return condition;
    }
}
