package com.mphasis.secondspringapp.service;

public class MailServerConfig {

    private String host;
    private int port;

    public MailServerConfig(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }
}
