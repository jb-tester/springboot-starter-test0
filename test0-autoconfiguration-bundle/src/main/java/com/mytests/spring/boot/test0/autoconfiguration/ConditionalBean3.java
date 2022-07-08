package com.mytests.spring.boot.test0.autoconfiguration;

import org.springframework.beans.factory.annotation.Value;


public class ConditionalBean3 {
    @Value("condition3")
    String id;

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ConditionalBean3{" +
                "id='" + id + '\'' +
                '}';
    }
}
