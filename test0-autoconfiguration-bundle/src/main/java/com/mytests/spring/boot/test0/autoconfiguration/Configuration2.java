package com.mytests.spring.boot.test0.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@AutoConfigureAfter(name = "configuration1")
@ConditionalOnBean(Condition1Bean.class)
@Configuration
public class Configuration2 {

    @Bean @ConditionalOnMissingBean(Condition2Bean.class)
    public ConditionalBean1 conditionalBean1(Condition1Bean condition1) {
        return new ConditionalBean1(condition1);
    }

    @Override
    public String toString() {
        return "Configuration2{ conditional on Condition1Bean bean presence config registered in EnableAutoConfiguration list in spring.factories}";
    }
}
