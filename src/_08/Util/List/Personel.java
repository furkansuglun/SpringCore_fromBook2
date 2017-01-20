package _08.Util.List;

import java.util.List;

public class Personel {
	private List<?> list;

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Personeller : " + list;
	}
	
	
}
