package edu.htwm.vsp.hello.service.impl;

import edu.htwm.vsp.hello.service.SayHello;

/**
 * 
 * Eine freundliche Begrüßung auf Französisch.
 * 
 * @author std
 *
 */
public class SayHelloInFrench implements SayHello {

	@Override
	public String sayHelloTo(String name) {
		return "Bonjour " + name + ".";
	}

}
