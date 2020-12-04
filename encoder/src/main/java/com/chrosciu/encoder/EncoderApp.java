package com.chrosciu.encoder;

public class EncoderApp {
    public static void main(String[] args) {
        EncoderService encoderService = new EncoderService();
        if (args.length > 0) {
            String input = args[0];
            System.out.println("Encoded value of " + input + " is " + encoderService.encodeBase64(input));
        } else {
            throw new IllegalArgumentException("No input value to encode provided");
        }
    }
}
