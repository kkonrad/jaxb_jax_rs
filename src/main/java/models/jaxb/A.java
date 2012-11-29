package models.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "classA")
public class A {

	private Integer a;
	private String text;
	private List<B> elements;
	public Integer getA() {
		return a;
	}
	public void setA(Integer a) {
		this.a = a;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<B> getElements() {
		return elements;
	}
	public void setElements(List<B> elements) {
		this.elements = elements;
	}
	
	
}
