
package com.mphasis.springwebapp.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mphasis.springwebapp.model.Contact;
import com.mphasis.springwebapp.service.ContactService;
 
@Controller
public class ContactsController {
	@Autowired
	private ContactService contactService;
	@RequestMapping(value = "/contacts",method=RequestMethod.GET)
	public String contactPage(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts",contacts);
		return "contactspage";
	}
}