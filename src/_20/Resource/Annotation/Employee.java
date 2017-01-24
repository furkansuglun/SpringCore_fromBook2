package _20.Resource.Annotation;

import javax.annotation.Resource;

public class Employee {

	//city deðiþkeninin kaynaðýnýn neresi oldugunu @resource annotation ý ile belirliyoruz
	
	@Resource(name="cityBean")
	private City city;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
	
}
