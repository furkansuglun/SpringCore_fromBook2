package _04.Injecting.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	//javada list, set , map ve properties collection'larn�n Spring ile nas�l kullan�laca��n� bu �rnekte g�rece�iz.
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("04.spring.xml");
	
		Ogrenci ogrenci = applicationContext.getBean("beanOgrenci",Ogrenci.class);
		
		ogrenci.getOgrenciList();
		ogrenci.getOgrenciSet();
		ogrenci.getOgrenciMap();
		ogrenci.getOgrenciProp();
	
		((AbstractApplicationContext) applicationContext).close();
		
	}
	
	
	
}
