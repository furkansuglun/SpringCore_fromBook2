package _12.AutoWiring.Beans.No;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("12.spring.xml");
		
		Employee employee = applicationContext.getBean("employeeBean" , Employee.class);
		
		
		System.out.println(employee);
		
	}

}
