package com.chrosciu.encoder;

public class EncoderApp {
    public static void main(String[] args) {
        EncoderService encoderService = new EncoderService();
        System.out.println(encoderService.encodeBase64("Marcin"));
    }
}
