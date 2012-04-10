package com.corejsf;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@SuppressWarnings("serial")
@Named//("user")
@SessionScoped
public class UserBean implements Serializable {

	private String name = "Rudi";
	private String password;

	public String getName() {
		return name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGreeting() {
		if (name.length() == 0) {
			return ("");
		} else {
			return ("Welcome to JSF + Ajax, " + name + "!");
		}
	}

}
