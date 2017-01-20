package _05.Injecting.Collection.With.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("05.spring.xml");
		
		Collections collections = applicationContext.getBean("collections" , Collections.class);
		
		System.out.println(collections);
		
		((AbstractApplicationContext) applicationContext).close();
	}

}
