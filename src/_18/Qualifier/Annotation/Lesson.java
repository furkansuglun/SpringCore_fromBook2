package _18.Qualifier.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Lesson {

	@Autowired
	@Qualifier("studentBean2") //bu annotation sýnýfýn hangi bean ile haberleþeceðini belirtir.
	private Student student;
	
	private int point;
	private String lesson;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getLesson() {
		return lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	
	
}
