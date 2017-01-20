package _15.AutoWiring.Bean.By.Default;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("15.spring.xml");
		
		Employee employee = applicationContext.getBean("employee" , Employee.class);
		
		
		System.out.println(employee);
		
	}

}
