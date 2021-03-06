package array;

import java.util.Arrays;

public class ArraysLenght {
	public Person findLast(Person[] persons) {

		// TODO
		// String[] Person = {id, vardas, pavarde, ak, gimMetai, lytis };
		int[] Person = { 0, 1, 2, 3, 4, 5, 6 };
		// Person value = persons[2];
		int value = Person[2];
		value = Person[0];
		int size = Person.length;
		int first = Person.length + 0;
		int last = Person.length - 1;
		Arrays.toString(Person);
		System.out.println(Person.length -1);
		System.out.println(Person.length +0);
		System.out.println(Person.length);
		System.out.println(size);
		System.out.println(first);
		System.out.println(last);
		System.out.println(Arrays.toString(Person));
		return null;
	}

}
