package com.mytests.spring.boot.test0.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * *
 * <p>Created by irina on 2/22/2022.</p>
 * <p>Project: springboot-starter-test0</p>
 * *
 */
@Configuration
@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
public class Configuration4 {
}
