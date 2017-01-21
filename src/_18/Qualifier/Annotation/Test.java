package _18.Qualifier.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("18.spring.xml");
		
		Lesson lesson = applicationContext.getBean("lessonBean" , Lesson.class);
		
		System.out.println("name : " + lesson.getStudent().getName() );
		System.out.println("surname : " + lesson.getStudent().getSurname());
		System.out.println("age : " + lesson.getStudent().getAge() );
		System.out.println("Lesson : " + lesson.getLesson());
		System.out.println("Point : " + lesson.getPoint());
	}
	
}
