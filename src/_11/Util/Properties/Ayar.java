package _11.Util.Properties;

import java.util.Properties;

public class Ayar {

	Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	//burada s�n�fa ait de�i�ken ekrana yaz�lacakt�r
	@Override
	public String toString() {
		return "SONU� : " + properties;
	}
	
	//burada de�i�ken stringe �evirilip yaz�lacakt�r
	public void sonucuYaz() {
		System.out.println(properties.toString());
	}
	
	
}
