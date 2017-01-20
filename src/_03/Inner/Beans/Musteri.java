package _03.Inner.Beans;

public class Musteri {

	private Siparis siparis;
	
	public Musteri() {
		System.out.println("Musteri constructor");
	}

	public Siparis getSiparis() {
		System.out.println("Musteri sınıfındaki getSiparis() metodu");
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		System.out.println("Musteri sınıfındaki setSiparis() metodu");
		this.siparis = siparis;
	}
	
	//-----------------
	
	public void hesapOde() {
		System.out.println("Musteri sınıfındaki hesapOde() metodu");
		siparis.tutarSonucu();
	}
	
}
