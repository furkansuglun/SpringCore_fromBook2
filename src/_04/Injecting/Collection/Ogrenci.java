package _04.Injecting.Collection;

import java.util.*;

public class Ogrenci {

	List <?>  ogrenciList;
	Set  <?>  ogrenciSet;
	Map  <?,?>  ogrenciMap;
	Properties ogrenciProp;
	
	public List<?> getOgrenciList() {
		System.out.println("List elemanlarý : " + ogrenciList);
		return ogrenciList;
	}
	public void setOgrenciList(List<?> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}
	public Set<?> getOgrenciSet() {
		System.out.println("Set elemanlarý : " + ogrenciSet);
		return ogrenciSet;
	}
	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}
	public Map<?, ?> getOgrenciMap() {
		System.out.println("Map elemanlarý : " + ogrenciMap );
		return ogrenciMap;
	}
	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}
	public Properties getOgrenciProp() {
		System.out.println("Properties elemanlarý : " + ogrenciProp);
		return ogrenciProp;
	}
	public void setOgrenciProp(Properties ogrenciProp) {
		this.ogrenciProp = ogrenciProp;
	}
	
	
	
	
}
