package com.mphasis.springwebapp.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
import com.mphasis.springwebapp.controller.ContactsController;
import com.mphasis.springwebapp.model.Contact;
 
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ContactService {
 
    @Autowired
    private com.mphasis.springwebapp.dao.ContactDAO contactDAO;
    public List<Contact> getAllContacts(){
	 return contactDAO.findAll();
    }
}
	


