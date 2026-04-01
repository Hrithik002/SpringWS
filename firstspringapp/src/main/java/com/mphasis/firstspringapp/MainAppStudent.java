package com.mphasis.firstspringapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.service.StudentService;

public class MainAppStudent {

    public static void main(String[] args) {

    	ClassPathXmlApplicationContext container = 
                new ClassPathXmlApplicationContext("Spring-config.xml");
        
       StudentService studentService = container.getBean("studentService",StudentService.class);
        studentService.displayStudentInfo();
        
        container.close();
        container.registerShutdownHook();
    }
}
