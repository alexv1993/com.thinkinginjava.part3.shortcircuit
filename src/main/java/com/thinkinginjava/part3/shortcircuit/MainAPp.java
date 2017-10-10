package com.thinkinginjava.part3.shortcircuit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vendin on 10.10.2017.
 */
public class MainAPp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        ShortCircuit shortCircuit = (ShortCircuit) applicationContext.getBean("shortCircuit");
        boolean b = shortCircuit.test1(0) && shortCircuit.test2(2) && shortCircuit.test3(2);
        System.out.println("expression: " + b);
    }
}
