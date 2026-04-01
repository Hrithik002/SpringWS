package com.mphasis.secondspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.weatherapp.WeatherService;

public class MainAppWeather {
	
	public static void main(String args[]) {
		AnnotationConfigApplicationContext container = new
				AnnotationConfigApplicationContext(SpringConfig.class);
		
		WeatherService weatherService =
				container.getBean("weatherService",WeatherService.class);
		
		System.out.println(weatherService.getWeather("Pune"));
	}

}
