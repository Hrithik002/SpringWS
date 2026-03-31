package com.mphasis.secondspringapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    @Qualifier("mailServerConfigB")
    private MailServerConfig mailServerConfig;

    public void sendMail() {
        System.out.println("Using mail server: "
                + mailServerConfig.getHost()
                + ":" + mailServerConfig.getPort());
    }
}