package main.java.rec;

import java.util.Arrays;
import java.util.List;

public class FamilyGenerator {

	public static Person generateFamily() {
		Person grandChild1 = PersonFactory.createPerson("grandChild1");
		Person grandChild2 = PersonFactory.createPerson("grandChild2");
		Person grandChild3 = PersonFactory.createPerson("grandChild3");

		List<Person> grandChildrenList = Arrays.asList(grandChild1, grandChild2, grandChild3);
		Person child1 = PersonFactory.createPerson("child1", grandChildrenList);
		Person child2 = PersonFactory.createPerson("child2");

		Person parent = PersonFactory.createPerson("parent", Arrays.asList(child1, child2), null);

		return parent;
	}

	public static Person generateFullFamily() {
		// Person parent = PersonFactory.createPerson("parent", Arrays.asList(child1, child2), null);
		// Person grandChild1 = PersonFactory.createPerson("grandChild1");
		// Person grandChild2 = PersonFactory.createPerson("grandChild2");
		// Person grandChild3 = PersonFactory.createPerson("grandChild3");
		//
		// List<Person> grandChildrenList = Arrays.asList(grandChild1, grandChild2, grandChild3);
		// Person child1 = PersonFactory.createPerson("child1", grandChildrenList);
		// Person child2 = PersonFactory.createPerson("child2");
		//
		//
		//
		// return parent;
		return null;
	}
}
