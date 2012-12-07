package edu.htwm.vsp.phonebook.rest.impl;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hello")
public class HelloInfo {

	private String to;
	
	public HelloInfo() {
		this("world");
	}
	
	public HelloInfo(String to) {
		this.setTo(to);
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
}
