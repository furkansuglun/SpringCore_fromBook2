package _13.AutoWiring.Beans.ByName;

public class Address {

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return getAddress().toString();
	}
	
	
	
}
