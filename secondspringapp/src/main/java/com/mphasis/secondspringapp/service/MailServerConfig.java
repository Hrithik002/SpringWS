package com.mphasis.secondspringapp.service;

import org.springframework.stereotype.Component;


public class MailServerConfig {
	private String ip ;
	private String login ;
	private String token;
	public MailServerConfig() {
		// TODO Auto-generated constructor stub
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
