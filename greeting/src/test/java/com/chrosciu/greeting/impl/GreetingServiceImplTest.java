package com.chrosciu.greeting.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GreetingServiceImplTest {

    @Test
    public void shouldAddGivenName() {
        GreetingServiceImpl service = new GreetingServiceImpl();
        String greeting = service.greet("Marcin");
        Assertions.assertEquals("Hello Marcin!", greeting);
    }

}
