package _14.AutoWiring.Beans.ByConstructor;

public class Address {

	private String fullAddress;

	
	public String getFullAddress() {
		return fullAddress;
	}


	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}


	@Override
	public String toString() {
		return getFullAddress().toString();
	}
	
	
	
}
