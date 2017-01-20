package _15.AutoWiring.Bean.By.Default;

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
