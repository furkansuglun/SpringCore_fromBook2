package _19.PostConstructor.and.PreDestroy.Annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Wedding {

	private String mesaj;

	public String getMesaj() {
		System.out.println("mesaj: "+mesaj);
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init metodu");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy metodu");
	}
}
