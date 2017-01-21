package _16.Required.Annotation;

import org.springframework.beans.factory.annotation.Required;

public class Student {

	
	private Integer age;
	private String name,surname;
	
	
	public Integer getAge() {
		return age;
	}
	
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
}
