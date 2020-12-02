package com.chrosciu.greeting.impl;


import com.chrosciu.greeting.GreetingService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.CaseUtils;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet(String name) {
        if (ObjectUtils.isEmpty(name)) {
            throw new IllegalArgumentException("Cannot greet nobody!");
        }
        return "Hello " + name + "!";
    }

    @Override
    public String greetAsCamel(String name) {
        if (ObjectUtils.isEmpty(name)) {
            throw new IllegalArgumentException("Cannot greet nobody!");
        }
        return CaseUtils.toCamelCase("Hello " + name + "!", true);
    }
}
