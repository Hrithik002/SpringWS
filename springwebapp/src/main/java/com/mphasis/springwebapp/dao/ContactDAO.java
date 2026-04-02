package com.mphasis.springwebapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.springwebapp.model.Contact;

@Repository("contactDAO")
public class ContactDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Contact> findAll() {
		String query ="select * from contacts";
		return jdbcTemplate.query(query, 
				new BeanPropertyRowMapper<Contact>(Contact.class));
				
	}

	public Contact findById(String id) {
		String query = "Select * from contacts where id = ?";
		return jdbcTemplate.queryForObject(query, 
				new BeanPropertyRowMapper<Contact>(Contact.class),id);

	}

	public int save(Contact contact) {
		String query = "insert into contacts(id,name,email) values(?,?,?)";
		int n =  jdbcTemplate.update(query, 
				contact.getId(),contact.getName(),contact.getEmail());
		return n;

	}

	public int delete(String id) {
		String query="delete from contacts where id=?";
		int n = jdbcTemplate.update(query, id);
		return n;
	}

	public int updateEmail(String id, String newEmail) {
		String query="update contacts set email=? where id=?";
		int n = jdbcTemplate.update(query,newEmail, id);
		return n;
		
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
}