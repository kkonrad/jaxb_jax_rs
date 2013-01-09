package service;

import javax.ws.rs.Path;

/**
 *
 * @author konrad
 */
@Path("/inherit")
public class Start {
	
	@Path("a")
	public AEntry getA(){
		return new AEntry();
	}
	
	@Path("b")
	public BEntry getB(){
		return new BEntry();
	}
	
	@Path("mix")
	public BaseEntry getMix(){
		if (Math.random() < 0.5) {
			return getA();
		}
		return getB();
	}
}
