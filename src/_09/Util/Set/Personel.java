package _09.Util.Set;

import java.util.Set;

public class Personel {
	
	private Set<?> set;

	public Set<?> getSet() {
		return set;
	}

	public void setSet(Set<?> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "Personeller : " + set;
	}
	
	
}
