package com.mphasis.springjdbcapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.springjdbcapp.config.SpringConfig;
import com.mphasis.springjdbcapp.dao.ContactDAO;
import com.mphasis.springjdbcapp.model.Contact;

public class MainContactDAO {
	public static void main(String args[]) {
		findAll();
	}
	public static void save() {
		AnnotationConfigApplicationContext container = new
				AnnotationConfigApplicationContext(SpringConfig.class);
		ContactDAO contactDAO = container.getBean("contactDAO",ContactDAO.class);
				
		int n = contactDAO.save(new Contact("C3","Jain","jain@gmail.com"));
		System.out.println(n + "record saved...");
		
		container.close();
	}
	
	public static void findAll() {
		AnnotationConfigApplicationContext container = new
				AnnotationConfigApplicationContext(SpringConfig.class);
		ContactDAO contactDAO = container.getBean("contactDAO",ContactDAO.class);
		contactDAO.findAll().stream().forEach(c->		
		System.out.println(c.getName() + "," +c.getEmail()));
		
		container.close();
	}


}
