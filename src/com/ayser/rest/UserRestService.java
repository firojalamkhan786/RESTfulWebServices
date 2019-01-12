/**
 * 
 */
package com.ayser.rest;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
/**
 * @author Ayser Alam Khan
 *
 */
@Path("/userService")
public class UserRestService {

	@GET
	@Path("hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String helloWorld() {
		
		return "Hello Ayser";
	}
	
}
