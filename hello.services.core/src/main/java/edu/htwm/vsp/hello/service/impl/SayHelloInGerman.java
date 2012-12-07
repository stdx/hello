package edu.htwm.vsp.hello.service.impl;

import edu.htwm.vsp.hello.service.SayHello;

/**
 * Eine freundliche Begrüßung auf Deutsch.
 * 
 * @author std
 *
 */
public class SayHelloInGerman implements SayHello {

	@Override
	public String sayHelloTo(String name) {
		return "Hallo " + name + ".";
	}

}
