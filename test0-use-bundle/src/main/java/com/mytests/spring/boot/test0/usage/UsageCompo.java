package com.mytests.spring.boot.test0.usage;

import com.mytests.spring.boot.test0.autoconfiguration.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 2/22/2022.</p>
 * <p>Project: springboot-starter-test0</p>
 * *
 */
@Component
public class UsageCompo {


    @Autowired(required = false)  Condition1Bean condition1Bean; // @ConditionalOnProperty(name = "my.conf.props.condition1", havingValue = "true")

    // should not be available since the property has value 'false'!
    @Autowired(required = false)  Condition2Bean condition2Bean; // @ConditionalOnProperty(name = "my.conf.props.condition2", havingValue = "true")


    @Autowired(required = false)  ConditionalBean1 conditionalBean1; // @ConditionalOnMissingBean(Condition2Bean.class) - - should be available if NOT my.conf.props.condition1=true

    @Autowired(required = false)  ConditionalBean3 conditionalBean3; // should be available if Configuration3 is available

    @Autowired(required = false)  ConditionalBean4 conditionalBean4; // should be available if Configuration3 is available


    @Autowired(required = false)  Configuration1 configuration1; // not conditional
    @Autowired(required = false)  Configuration2 configuration2; // @ConditionalOnBean(Condition1Bean.class) - should be available if my.conf.props.condition1=true
    @Autowired(required = false)  Configuration3 configuration3; // @ConditionalOnClass({ConditionalBean3.class, ConditionalBean4.class})
    @Autowired(required = false)  Configuration4 configuration4; // not conditional



    public void displayAll(){
        if (this.condition1Bean != null) {
            System.out.println("condition1Bean is available: "+this.condition1Bean.getProvidedString());
        } else {
            System.out.println("condition1Bean is not available");
        }
        if (this.condition2Bean != null) {
            System.out.println("condition2Bean is available: "+this.condition2Bean.toString());
        } else {
            System.out.println("!!! condition2Bean is not available");
        }
        if (this.conditionalBean1 != null) {
            System.out.println(this.conditionalBean1.getProvidedString());
        } else {
            System.out.println("!!! conditional1Bean1 is not available");
        }
        if (this.conditionalBean3 != null) {
            System.out.println("ConditionalBean3 is available: condition is "+this.conditionalBean3.getId());
        } else {
            System.out.println("!!! conditional1Bean3 is not available");
        }
        if (this.conditionalBean4 != null) {
            System.out.println(this.conditionalBean4.toString()+" with dependency to "+this.conditionalBean4.getCondition().toString());
        } else {
            System.out.println("!!! conditional1Bean4 is not available");
        }
        System.out.println("--configuration classes:");
        if (this.configuration1 != null) {
            System.out.println(this.configuration1.toString());
        } else {
            System.out.println("!!! configuration1 is not available");
        }
        if (this.configuration2 != null) {
            System.out.println(this.configuration2.toString());
        } else {
            System.out.println("!!! configuration2 is not available");
        }
        if (this.configuration3 != null) {
            System.out.println(this.configuration3.toString());
        } else {
            System.out.println("!!! configuration3 is not available");
        }
        if (this.configuration4 != null) {
            System.out.println(this.configuration4.toString());
        } else {
            System.out.println("!!! configuration4 is not available");
        }
    }

}
