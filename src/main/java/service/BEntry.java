package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author konrad
 */
public class BEntry extends BaseEntry{

	@GET @Path("/b")
	public String b(){
		return "You say b, I say ... BBBBB!!";
	}
}
