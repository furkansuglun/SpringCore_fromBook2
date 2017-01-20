package _07.Multiple.Spring.Configuration.File.customer;

public class Customer {

	public Customer() {
		System.out.println("Müþteri sýnýfý");
	}
	
	String adi,soyadi,telNo;
	Address address;
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
