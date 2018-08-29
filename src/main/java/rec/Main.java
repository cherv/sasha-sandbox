package main.java.rec;

public class Main {

	public static void main(String[] args) {
		printFamilyNames(FamilyGenerator.generateFamily());

		// example(5);
	}

	/**
	 * Print all family member's names
	 *
	 * @param person - family member
	 */
	private static void printFamilyNames(Person person) {
		System.out.println(person.getName());
		for(Person child: person.getChildrenList()){
			printFamilyNames(child);
		}
		System.out.println("after "+person.getName());
	}

	public static void example(int num){
		num--;
		System.out.println("Первая половина метода"+num);
		if(num!=0){
			example(num);
		}
		System.out.println("Вторая половина метода"+num);
	}
}
