package _10.Util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _09.Util.Set.Personel;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("10.spring.xml");
		
		Personel personel = applicationContext.getBean("personelBean" , Personel.class);
		
		System.out.println(personel);
		
		((AbstractApplicationContext) applicationContext).close();
		
	}
	
}
