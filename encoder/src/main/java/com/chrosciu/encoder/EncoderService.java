package com.chrosciu.encoder;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncoderService {
    public String encodeBase64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
    }
}
