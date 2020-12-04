package com.chrosciu.app;

import com.chrosciu.crypto.CryptoService;
import com.chrosciu.encoder.EncoderService;
import com.chrosciu.greeting.GreetingService;
import com.chrosciu.greeting.impl.GreetingServiceImpl;
import com.chrosciu.model.Book;
import com.chrosciu.model.User;
import com.chrosciu.stacktrace.StacktraceService;
import com.chrosciu.xml.XmlService;


public class Application {
    public static void main(String[] args) throws Exception {
        GreetingService greetingService = new GreetingServiceImpl();
        String input = "Marcin";
        System.out.println("Greeting for input " + input + " is " + greetingService.greet(input));
        System.out.println("Camel greeting for input " + input + " is " + greetingService.greetAsCamel(input));
        CryptoService cryptoService = new CryptoService();
        System.out.println("Current crypto provider name: " + cryptoService.getCryptoProviderName());
        EncoderService encoderService = new EncoderService();
        System.out.println("Encoded value of " + input + " is " + encoderService.encodeBase64(input));
        StacktraceService stacktraceService = new StacktraceService();
        System.out.println("Classes on current callstack:");
        stacktraceService.getCallStackClassNames().forEach(System.out::println);
        Book book = new Book();
        book.setAuthor("Mickiewicz");
        book.setTitle("Dziady");
        User user = User.builder().name("Marcin").build();
        XmlService xmlService = new XmlService();
        System.out.println("XML for book: " + book);
        System.out.println(xmlService.getXmlForObject(Book.class, book));
        System.out.println("XML for user: " + user);
        System.out.println(xmlService.getXmlForObject(User.class, user));
    }
}
