package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author konrad
 */
public class AEntry extends BaseEntry{

	@GET @Path("/a")
	public String a(){
		return "You say a, I say ... a";
	}
}
