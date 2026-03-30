package com.mphasis.firstspringapp;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.service.CarService;
 
public class MainAppCar { 
 
    public static void main(String[] args) {
 
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
 
        CarService carService = (CarService) context.getBean("carService");
 
        carService.displayCarInfo();
    }
}
 