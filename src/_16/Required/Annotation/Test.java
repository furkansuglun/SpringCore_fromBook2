package _16.Required.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("16.spring.xml");
		
		Student student = applicationContext.getBean("studentBean" , Student.class);
		
		System.out.println("name : " + student.getName());
		System.out.println("surname : " + student.getSurname());
		System.out.println("age : " + student.getAge());
		
	}
	
}
