package com.mytests.spring.boot.test0.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("my.conf.props")
public class ConfProperties {
    boolean condition1;
    boolean condition2;

    public boolean isCondition1() {
        return condition1;
    }

    public void setCondition1(boolean condition1) {
        this.condition1 = condition1;
    }

    public boolean isCondition2() {
        return condition2;
    }

    public void setCondition2(boolean condition2) {
        this.condition2 = condition2;
    }
}
