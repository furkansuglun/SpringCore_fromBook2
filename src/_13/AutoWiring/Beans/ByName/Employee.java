package _13.AutoWiring.Beans.ByName;

public class Employee {

	private String name,surname;
	private Address address;
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/////------------
	@Override
	public String toString() {
		return "Employee name : "+getName()+"\nEmployee surname : " + getSurname() +"\nEmployee Address : " + getAddress();
	}
	
	
	
	
	
	
}
