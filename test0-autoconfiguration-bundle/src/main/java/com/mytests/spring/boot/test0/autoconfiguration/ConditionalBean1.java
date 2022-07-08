package com.mytests.spring.boot.test0.autoconfiguration;

public class ConditionalBean1 {
    private final Condition1Bean condition1;

    public ConditionalBean1(Condition1Bean condition1) {
        this.condition1 = condition1;
    }

    public String getProvidedString(){
        return condition1.getProvidedString()+"; conditional bean1 is available ";
    }
}
