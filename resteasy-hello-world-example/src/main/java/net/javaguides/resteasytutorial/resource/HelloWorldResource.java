package net.javaguides.resteasytutorial.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import net.javaguides.resteasytutorial.model.HelloWorld;


@Path("hello")
public class HelloWorldResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloWorld (){
		HelloWorld helloWorld=new HelloWorld(" Willmer ");  
		return Response.ok(helloWorld).build();	
	}

}
