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
        System.out.println(greetingService.greet("Marcin"));
        System.out.println(greetingService.greetAsCamel("Marcin"));
        CryptoService cryptoService = new CryptoService();
        System.out.println(cryptoService.getCryptoProviderName());
        EncoderService encoderService = new EncoderService();
        System.out.println(encoderService.encodeBase64("Marcin"));
        StacktraceService stacktraceService = new StacktraceService();
        stacktraceService.getCallStackClassNames().forEach(System.out::println);
        Book book = new Book();
        book.setAuthor("Mickiewicz");
        book.setTitle("Dziady");
        User user = new User();
        user.setName("Marcin");
        XmlService xmlService = new XmlService();
        System.out.println(xmlService.getXmlForObject(Book.class, book));
        System.out.println(xmlService.getXmlForObject(User.class, user));
    }
}
