package com.mphasis.secondspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.mphasis.secondspringapp.service.MailServerConfig;
import com.mphasis.weatherapp.WeatherService;

@Configuration
@ComponentScan(basePackages = {"com.mphasis.secondspringapp"})
@EnableAspectJAutoProxy
public class SpringConfig {
	
	@Bean("weatherService")
	@Scope("singleton")
	public WeatherService weatherService() {
		return new WeatherService();
	}
@Bean("mailServerConfig")
//@Profile("prod")
	public MailServerConfig mailServerConfig() {
		MailServerConfig mailServerConfig = new MailServerConfig();
		mailServerConfig.setIp("192.168.12.1");
		mailServerConfig.setLogin("Tom");
		mailServerConfig.setToken("X!@#$");
		return mailServerConfig;
	}
@Bean("mailServerConfigB")
//@Profile("dev")
public MailServerConfig mailServerConfigB() {
	MailServerConfig mailServerConfig = new MailServerConfig();
	mailServerConfig.setIp("192.168.12.2");
	mailServerConfig.setLogin("test");
	mailServerConfig.setToken("X!@#$");
	return mailServerConfig;
}


@Configuration
@ComponentScan(basePackages = {
        "com.mphasis.secondspringapp.ecommerce"
})
public class SpringConfigEcommerce {
}

}
