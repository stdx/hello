package edu.htwm.vsp.hello.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.htwm.vsp.hello.service.SayHello;

@Path("hello")
public class HelloResource  {

	@Context
	private SayHello sayHello;

	@GET
	@Path("{name}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response sayHello(@PathParam("name") String name) {
		
		String greeting = sayHello.sayHelloTo(name);
		Response r = Response.ok(new GreetingInfo(greeting)).build();
		return r;
	}
	

}
