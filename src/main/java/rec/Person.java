package main.java.rec;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private Person parent;
	private String name;
	private List<Person> childrenList = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getChildrenList() {
		return childrenList;
	}

	public Person getParent() {
		return parent;
	}

	public void setParent(Person parent) {
		this.parent = parent;
	}
}
