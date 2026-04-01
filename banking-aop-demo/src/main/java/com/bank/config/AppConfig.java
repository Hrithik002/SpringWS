package com.bank.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@ComponentScan(basePackages = "com.bank")
@EnableAspectJAutoProxy
public class AppConfig {
}
