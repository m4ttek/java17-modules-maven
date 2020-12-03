package com.chrosciu.app;

import com.chrosciu.greeting.GreetingService;
import com.chrosciu.greeting.impl.GreetingServiceImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    public void test() {
        GreetingService greetingService = new GreetingServiceImpl();
        greetingService.greet("Marcin");
    }
}
