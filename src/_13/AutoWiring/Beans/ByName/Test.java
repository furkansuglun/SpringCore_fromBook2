package _13.AutoWiring.Beans.ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("13.spring.xml");
		
		Employee employee = applicationContext.getBean("employeeBean" , Employee.class);
		
		
		System.out.println(employee);
		
	}

}
