package com.chrosciu.crypto;

import com.sun.crypto.provider.SunJCE;

public class CryptoService {
    public String getCryptoProviderName() {
        return new SunJCE().getName();
    }
}
