package _11.Util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("11.spring.xml");
		
		Ayar ayar = applicationContext.getBean("ayarBean" , Ayar.class);
		
		System.out.println(ayar);
		
		ayar.sonucuYaz();
	}

}
