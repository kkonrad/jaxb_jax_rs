package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "classB")
public class B {

	private Boolean bool;
	private Double doubl;
	public Boolean getBool() {
		return bool;
	}
	public void setBool(Boolean bool) {
		this.bool = bool;
	}
	public Double getDoubl() {
		return doubl;
	}
	public void setDoubl(Double doubl) {
		this.doubl = doubl;
	}
}
