package com.chrosciu.crypto;

import java.security.Provider;
import java.security.Security;

public class CryptoService {
    public String getCryptoProviderName() {
        Provider[] providers = Security.getProviders();
        if (providers.length > 0) {
            return providers[0].getName();
        } else {
            throw new IllegalStateException("No security providers defined!");
        }
    }
}
