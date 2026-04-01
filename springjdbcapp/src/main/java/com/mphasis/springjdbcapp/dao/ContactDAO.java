package com.mphasis.springjdbcapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.springjdbcapp.model.Contact;

@Repository("contactDAO")
public class ContactDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
    public List<Contact> findAll() {
 		String query = "select * from contacts";
 		return jdbcTemplate.query(query, 
 				new BeanPropertyRowMapper<Contact>(Contact.class));
		
	}
     
     public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Contact findById(String id) {
    	 String query = "select * from contacts where id = ?";
			return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<Contact>(Contact.class),id );
    	 
     }
     
     public int save(Contact contact) {
    	 String query = "insert into contacts(id,name,email) value(?,?,?)";
    	 int n = jdbcTemplate.update(query,contact.getId(),contact.getName(),contact.getEmail());
    	 return n;
     }
     
     public int delete(String id) {
    	 String query = "delete from contacts where id = ?";
			return jdbcTemplate.update(query,id);
    	 
     }
     
     public int updateEmail(String id, String email) {
    	 String query = "update contacts set email = ? where id = ?";
			int n = jdbcTemplate.update(query,email,id);
			return n;
    	 
     }
     
    

}
