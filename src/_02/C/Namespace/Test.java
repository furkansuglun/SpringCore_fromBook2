package _02.C.Namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("02.spring.xml");
		
		//1.yol casting(tip düönüþümü)
		//Calisan calisan = (Calisan) applicationContext.getBean("beanCalisan");
		
		//2.yol casting yok
		Calisan calisan = applicationContext.getBean("beanCalisan" , Calisan.class);
		
		//3.yol casting yok sýnýf adý direk yazýlýr.
		//Calisan calisan = applicationContext.getBean(Calisan.class);
		
		System.out.println("ADI : " + calisan.getAdi());
		System.out.println("SOYADI : " + calisan.getSoyadi());
		System.out.println("YAÞI : " + calisan.getYasi());
		System.out.println("ÞEHÝR : " + calisan.getAdres().sehir);
		System.out.println("SEMT : " + calisan.getAdres().semt);
		System.out.println("MAHALLE : " + calisan.getAdres().mahalle);
		System.out.println("CADDE : " + calisan.getAdres().cadde);
		System.out.println("NO : " + calisan.getAdres().no);
		System.out.println("DAÝRE : " + calisan.getAdres().daire);
	}

}
