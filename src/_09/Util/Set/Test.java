package _09.Util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("09.spring.xml");
		
		Personel personel = applicationContext.getBean("personelBean" , Personel.class);
		
		System.out.println(personel);
		
		((AbstractApplicationContext) applicationContext).close();
		
	}

}
