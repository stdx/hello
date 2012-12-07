package edu.htwm.vsp.hello.service;

/**
 * 
 * Ein freundlicher Dienst für eine freundliche Begrüßung.
 * 
 * @author std
 * 
 */
public interface SayHello {

	/**
	 * 
	 * Erzeugt eine freundliche Begrüßung.
	 * 
	 * @param name
	 *            Der Name der Person, die begrüßt werden soll.
	 *            
	 * @return Eine freundliche Begrüßung.
	 */
	String sayHelloTo(String name);
	
}
