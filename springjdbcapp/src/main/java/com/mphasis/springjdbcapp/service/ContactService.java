package com.mphasis.springjdbcapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mphasis.springjdbcapp.dao.ContactDAO;
import com.mphasis.springjdbcapp.model.Contact;

@Service
public class ContactService {
	@Autowired
	private ContactDAO contactDAO;
	@Transactional(propagation = Propagation.REQUIRED)
	public int createContact(Contact contact) {
		return contactDAO.save(contact);
	}
}