/*package com.mphasis.springwebapp.service;
 
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
}*/

package com.mphasis.springwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.springwebapp.dao.ContactDAO;
import com.mphasis.springwebapp.model.Contact;

@Service
public class ContactService {

    @Autowired
    private ContactDAO contactDAO;

    public List<Contact> getAllContacts() {
        return contactDAO.findAll();
    }

    public Contact getContactById(String id) {
        try {
            return contactDAO.findById(id);
        } catch (Exception e) {
            return null;
        }
    }

    public void addContact(Contact contact) {
        contactDAO.save(contact);
    }

    public boolean deleteContact(String id) {
        return contactDAO.delete(id) > 0;
    }

    public boolean updateEmail(String id, String email) {
        return contactDAO.updateEmail(id, email) > 0;
    }
}
	


