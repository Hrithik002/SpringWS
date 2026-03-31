package com.mphasis.secondspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.mphasis.secondspringapp.service.MailServerConfig;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.mphasis.secondspringapp")
public class SpringConfig {

    @Bean(name = "mailServerConfigA")
    public MailServerConfig mailServerConfigA() {
        return new MailServerConfig("smtp.gmail.com", 587);
    }

    @Bean(name = "mailServerConfigB")
    public MailServerConfig mailServerConfigB() {
        return new MailServerConfig("smtp.outlook.com", 25);
    }
}
