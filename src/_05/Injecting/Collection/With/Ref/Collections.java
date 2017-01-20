package _05.Injecting.Collection.With.Ref;

import java.util.*;

public class Collections {

	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
	private Properties properties;
	
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> lists) {
		this.lists = lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}
	public Map<Object, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "lists=" + lists + "\n sets=" + sets + "\n maps=" + maps + "\n properties=" + properties ;
	}
	
	
	
}
