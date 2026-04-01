package com.mphasis.secondspringapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.mphasis.secondspringapp.ecommerce"
})
public class SpringConfigEcommerce {
}