package _01.P.Namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("01.spring.xml");
		
		Ogrenci ogrenci = (Ogrenci) applicationContext.getBean("beanOgrenci");
		
		System.out.println("ADI : " + ogrenci.getAdi());
		System.out.println("SOYADI : " + ogrenci.getSoyadi());
		System.out.println("NUMARASI : " + ogrenci.getNumarasi());
		System.out.println("ÜNÝVERSÝTESÝ : " + ogrenci.getUniversitesi().kurumAdi);
	}

}
