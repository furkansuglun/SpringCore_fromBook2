package _19.PostConstructor.and.PreDestroy.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("19.spring.xml");
		
		Wedding wedding = applicationContext.getBean("weddingBean",Wedding.class);
		
		wedding.getMesaj();
		
		((AbstractApplicationContext) applicationContext).close();
		
	}
	
}
