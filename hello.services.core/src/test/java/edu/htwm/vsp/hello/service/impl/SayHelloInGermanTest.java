package edu.htwm.vsp.hello.service.impl;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.htwm.vsp.hello.service.SayHello;

public class SayHelloInGermanTest {

	private SayHello sayHelloInGerman;

	@Before
	public void startHelloService() {
		sayHelloInGerman = new SayHelloInGerman();
	}
	
	
	@Test
	public void checkHelloInGerman() {
		
		String expectedName = "foo";
		String helloTo = sayHelloInGerman.sayHelloTo(expectedName);
		
		assertThat(helloTo, containsString(expectedName));
		assertThat(helloTo, containsString("Hallo"));
	}

}
