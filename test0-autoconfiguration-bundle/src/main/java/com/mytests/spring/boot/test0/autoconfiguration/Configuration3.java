package com.mytests.spring.boot.test0.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 2/22/2022.</p>
 * <p>Project: springboot-starter-test0</p>
 * *
 */
@Configuration
@ConditionalOnClass({ConditionalBean3.class, ConditionalBean4.class})
public class Configuration3 {

    @Bean
    public ConditionalBean3 cond3() {
        return new ConditionalBean3();
    }

    @Bean
    public ConditionalBean4 cond4(@Autowired ConditionalBean3 conditionalBean3) {
        return new ConditionalBean4(conditionalBean3);
    }
}
