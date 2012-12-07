package edu.htwm.vsp.phonebook.rest.impl;

import java.util.ArrayList;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import edu.htwm.vsp.hello.rest.HelloResource;
import edu.htwm.vsp.hello.service.SayHello;

public class HelloResourceImpl implements HelloResource {

	@Context
	private SayHello sayHello;

	@Override
	public Response sayHello(String name, int times) {
		
		Response r = null;
		if(times < 1)
			r = Response.status(Status.NOT_ACCEPTABLE).build(); 
		else if(times == 1) {
			r = Response.ok(new HelloInfo(name)).build();
		} else {
			ArrayList<HelloInfo> hellos = new ArrayList<HelloInfo>(times);
			for(int i = 0; i < times; i++) {
				hellos.add(new HelloInfo(name));
			}
			r = Response.ok(hellos).build();
		}
		return r;
	}
	
	

}
