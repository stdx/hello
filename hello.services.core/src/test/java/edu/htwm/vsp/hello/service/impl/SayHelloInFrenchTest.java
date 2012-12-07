package edu.htwm.vsp.hello.service.impl;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import edu.htwm.vsp.hello.service.SayHello;

public class SayHelloInFrenchTest {

	private SayHello sayHelloInFrench;

	@Before
	public void startHelloService() {
		sayHelloInFrench = new SayHelloInFrench();
	}
	
	
	@Test
	public void checkFrenchInHello() {
		
		String expectedName = "foo";
		String helloTo = sayHelloInFrench.sayHelloTo(expectedName);
		
		assertThat(helloTo, containsString(expectedName));
		assertThat(helloTo, containsString("Bonjour"));
	}

}
