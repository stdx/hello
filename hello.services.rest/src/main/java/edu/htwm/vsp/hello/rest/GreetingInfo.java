package edu.htwm.vsp.hello.rest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name = "greeting")
public class GreetingInfo {

	private String greeting;
	
	public GreetingInfo() {
		this("Hallo Du.");
	}
	
	public GreetingInfo(String greeting) {
		this.setGreeting(greeting);
	}

	@XmlValue
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
