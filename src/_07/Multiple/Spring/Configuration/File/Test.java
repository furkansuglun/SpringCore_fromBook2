package _07.Multiple.Spring.Configuration.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import _07.Multiple.Spring.Configuration.File.customer.Customer;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("07.spring.xml");
		
		Customer customer = applicationContext.getBean("beanCustomer" , Customer.class);
		
		System.out.println("ADI : " + customer.getAdi() + "\n" +
						   "SOYADI : " + customer.getSoyadi() + "\n" +
						   	"ADRES : " + customer.getAddress().getAdres() );
		
		((AbstractApplicationContext) applicationContext).close();
	}

}
