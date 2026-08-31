package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Intentionally vulnerable — DO NOT deploy.
 * Contains a hardcoded fake AWS credential to trigger GitHub secret scanning.
 */
public class App {
    private static final Logger LOG = LogManager.getLogger(App.class);

    // TEST FIXTURE ONLY — fake AWS key to trigger secret scanning alert
    private static final String AWS_ACCESS_KEY_ID     = "AKIAIOSFODNN7EXAMPLE";
    private static final String AWS_SECRET_ACCESS_KEY = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY";

    public static void main(String[] args) {
        LOG.info("vuln-java-app test fixture starting");
    }
}
