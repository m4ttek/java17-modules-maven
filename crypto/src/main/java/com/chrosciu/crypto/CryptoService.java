package com.chrosciu.crypto;

import com.sun.crypto.provider.SunJCE;

public class CryptoService {
    public String getCryptoProviderName() {
        Module module = this.getClass().getModule();
        System.out.println("Module for CryptoService class " + module.getName());
        return new SunJCE().getName();
    }
}
