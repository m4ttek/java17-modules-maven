package com.chrosciu.encoder;

import sun.misc.BASE64Encoder;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncoderService {
    public String encodeBase64(String input) {
        return new BASE64Encoder().encode(input.getBytes(StandardCharsets.UTF_8));
    }
}
