package edu.htwm.vsp.hello.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public interface HelloResource {

	@GET
	@Path("{name}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	Response sayHello(
		@PathParam("name") String name, 
		@QueryParam("times") int times);
	
}
