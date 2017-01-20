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

	//burada sýnýfa ait deðiþken ekrana yazýlacaktýr
	@Override
	public String toString() {
		return "SONUÇ : " + properties;
	}
	
	//burada deðiþken stringe çevirilip yazýlacaktýr
	public void sonucuYaz() {
		System.out.println(properties.toString());
	}
	
	
}
