package main.java.rec;

import java.util.List;

public class PersonFactory {

	public static Person createPerson(String name) {
		Person person = new Person();
		person.setName(name);
		return person;
	}

	public static Person createPerson(String name, List<Person> childrenList) {
		Person person = createPerson(name);
		person.getChildrenList().addAll(childrenList);
		return person;
	}

	public static Person createPerson(String name, List<Person> childrenList, Person parent){
		Person person = createPerson(name, childrenList);
		person.setParent(parent);
		return person;
	}

	// public static Person createPerson
}
