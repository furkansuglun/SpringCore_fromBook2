package _20.Resource.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("20.spring.xml");
		
		Employee employee = applicationContext.getBean("employeeBean" , Employee.class);
		
		System.out.println(employee.getCity().getCityName().toString());
		
		((AbstractApplicationContext) applicationContext).close();
		
	}
	
}
