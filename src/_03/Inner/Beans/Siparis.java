package _03.Inner.Beans;

public class Siparis {

	int tutar;
	
	public Siparis() {
	 System.out.println("Siparis constructor");
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
	
	public void tutarSonucu() {
		System.out.println("Sipariş sınıfındali tutarSonucu() metodu");
		System.out.println("Toplam : " + tutar);
	}
	
}
