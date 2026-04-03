/*package com.mphasis.springwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.springwebapp.model.Contact;
import com.mphasis.springwebapp.service.ContactService;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactsRestController {
	@Autowired
	private ContactService contactService;
	@GetMapping
	public ResponseEntity<List<Contact>> getAllContacts(){
	return ResponseEntity.ok(contactService.getAllContacts());

}
}*/

package com.mphasis.springwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.springwebapp.model.Contact;
import com.mphasis.springwebapp.service.ContactService;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactsRestController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        return new ResponseEntity<>(contactService.getAllContacts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(
            @PathVariable("id") String id) {

        Contact contact = contactService.getContactById(id);

        return contact == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Contact> addContact(@RequestBody Contact contact) {
        contactService.addContact(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/email")
    public ResponseEntity<Void> updateEmail(
            @PathVariable("id") String id,
            @RequestBody Contact contact) {

        return contactService.updateEmail(id, contact.getEmail())
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(
            @PathVariable("id") String id) {

        return contactService.deleteContact(id)
                ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
