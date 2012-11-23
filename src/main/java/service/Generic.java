package service;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.GET;


public class Generic<T> {
	
	Collection<T> elements;
	
	public Generic(Collection<T> elements){
		this.elements = elements;
	}
	
	@GET
	public List<T> getAll(){
		return null;
//		return elements;
		
	}

}
