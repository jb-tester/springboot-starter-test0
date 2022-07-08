package com.mytests.spring.boot.test0.autoconfiguration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(ConfProperties.class)
public class Configuration1 {

    @Bean @ConditionalOnProperty(name = "my.conf.props.condition1", havingValue = "true")
    public Condition1Bean condition1Bean() {
        return new Condition1Bean();
    }
    @Bean @ConditionalOnProperty(name = "my.conf.props.condition2", havingValue = "true")
    public Condition2Bean condition2Bean() {
        return new Condition2Bean();
    }
}
