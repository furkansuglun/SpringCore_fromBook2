package _06.UsingBeans.For.Null.And.Empty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("06.spring.xml");
		
		Personel personel = applicationContext.getBean(Personel.class);
		
		System.out.println("Adý : " + personel.getAdi() + "\n" +
						   "Soyadi : " + personel.getSoyadi() +	"\n" +
						   "Görevi : " + personel.getGorevi() + "\n" +
						   "TelNo : " + personel.getTelNo() + "\n" +
						   "Adres : " + personel.getAdresi() + "\n" +
						   "Anne Adi : " + personel.getAnneAdi() + "\n" +
						   "Baba Adi : " + personel.getBabaAdi() + "\n" +
						   "Doðum Yýlý : " + personel.getDogumYili() + "\n" +
						   "Maaþ : " + personel.getMaasi() + "\n" +
						   "Ehliyet : " + personel.isEhliyeti() + "\n" +
						   "Medeni Hal : " + personel.isMedeniHali()
				);
	
			((AbstractApplicationContext) applicationContext).close();
		
	}

}
