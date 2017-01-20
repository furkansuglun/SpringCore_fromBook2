package _03.Inner.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("03.spring.xml");
		
		Musteri musteri = applicationContext.getBean("beanMusteri" , Musteri.class);
		
		musteri.hesapOde();
		
	}

}
