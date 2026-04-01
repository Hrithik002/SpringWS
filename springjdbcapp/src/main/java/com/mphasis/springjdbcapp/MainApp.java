package com.mphasis.springjdbcapp;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mphasis.springjdbcapp.config.SpringConfig;
import com.mphasis.springjdbcapp.model.Contact;

public class MainApp {
	public static void main(String args[]) {
	
		//save();
		//findall();
		//findById("C2");
		//delete("C3");
		updateEmail("C1","Tom1@gmail.com");

}

	private static void findall() {
		AnnotationConfigApplicationContext container = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		JdbcTemplate jdbcTemplate = container.getBean("jdbcTemplate",JdbcTemplate.class);
		String query = "select * from contacts";
		
		List<Contact> contacts = jdbcTemplate.query(query, 
				new BeanPropertyRowMapper<Contact>(Contact.class));
		
		for(Contact c : contacts) {
			System.out.println(c.getId() + "," + c.getName() + "," + c.getEmail());
		}
		container.close();
	}
		

		private static void save() {
			AnnotationConfigApplicationContext container = 
					new AnnotationConfigApplicationContext(SpringConfig.class);
			
			JdbcTemplate jdbcTemplate = container.getBean("jdbcTemplate",JdbcTemplate.class);
			String query = "insert into contacts(id,name,email) value(?,?,?)";
			Object[] params = {"C3","Ken","Ken@gmail.com"};
			int n = jdbcTemplate.update(query,params);
			System.out.println(n+ "record inserted");
			
		
		container.close();
	}
		
		private static void findById(String id) {
			AnnotationConfigApplicationContext container = 
					new AnnotationConfigApplicationContext(SpringConfig.class);
			
			JdbcTemplate jdbcTemplate = container.getBean("jdbcTemplate",JdbcTemplate.class);
			String query = "select * from contacts where id = ?";
			Contact c = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<Contact>(Contact.class),id );
			System.out.println(c.getId() +"," + c.getName() +"," + c.getEmail());
		container.close();
}
		
		private static void delete(String id) {
			AnnotationConfigApplicationContext container = 
					new AnnotationConfigApplicationContext(SpringConfig.class);
			
			JdbcTemplate jdbcTemplate = container.getBean("jdbcTemplate",JdbcTemplate.class);
			String query = "delete from contacts where id = ?";
			int n = jdbcTemplate.update(query,id);
			System.out.println(n+ "record deleted");
			
		
		container.close();
	}
		
		private static void updateEmail(String id, String email) {
			AnnotationConfigApplicationContext container = 
					new AnnotationConfigApplicationContext(SpringConfig.class);
			
			JdbcTemplate jdbcTemplate = container.getBean("jdbcTemplate",JdbcTemplate.class);
			String query = "update contacts set email = ? where id = ?";
			int n = jdbcTemplate.update(query,email,id);
			System.out.println(n+ "record updated");
			
		
		container.close();
	}
}

