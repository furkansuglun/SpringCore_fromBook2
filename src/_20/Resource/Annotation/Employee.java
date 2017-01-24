package _20.Resource.Annotation;

import javax.annotation.Resource;

public class Employee {

	//city de�i�keninin kayna��n�n neresi oldugunu @resource annotation � ile belirliyoruz
	
	@Resource(name="cityBean")
	private City city;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
	
}
