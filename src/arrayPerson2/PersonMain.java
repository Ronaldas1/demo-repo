package arrayPerson2;

public class PersonMain {
	public static void main(String[] args) {
		PersonSerializer serializer = new PersonSerializer();
		Person person = serializer.personFromString2("Ona Onute 4485465456 1100 mot");

		PersonActions actions = new PersonActions();
		if (actions.isItValid(person)) {
			actions.makePersonYounger(11, person);
			System.out.println(serializer.stringFromPerson(person));

		} else {
			System.err.println("nevalidus: "  +  serializer.stringFromPerson(person));

		}

	}

}
