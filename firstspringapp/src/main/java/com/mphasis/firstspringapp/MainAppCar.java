package com.mphasis.firstspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.service.CarService;
import com.mphasis.firstspringapp.service.StudentService;

public class MainAppCar {

    public static void main(String[] args) {
    	ClassPathXmlApplicationContext container = 
                new ClassPathXmlApplicationContext("Spring-config.xml");
    	 CarService carService = container.getBean("carService",CarService.class);
         carService.displayCarInfo();
        
        container.close();
        container.registerShutdownHook();
    }
}