package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author konrad
 */
public class BaseEntry {
	
	@GET @Path("/status")
	public String status(){
		return "It's super!";
	}
	
	
}
