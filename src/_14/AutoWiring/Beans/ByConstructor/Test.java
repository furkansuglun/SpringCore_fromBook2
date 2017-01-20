package _14.AutoWiring.Beans.ByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("14.spring.xml");
		
		Employee employee = applicationContext.getBean("employee" , Employee.class);
		
		
		System.out.println(employee);
		
	}

}
