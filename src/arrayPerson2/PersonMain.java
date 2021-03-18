package arrayPerson2;

public class PersonMain {
	public static void main(String[] args) {

		PersonActions actions = new PersonActions();
		String youngerPerson1 = actions.makePersonYoungerValidOnly("Onas Onukas klm5465456 1990 vyr");
		String youngerPerson2 = actions.makePersonYoungerValidOnly("Ona Onyte 5465456 1990 mot");
		String youngerPerson3 = actions.makePersonYoungerValidOnly("Jonas Jonaitis 5465456 1991 vyr");
		// String[] youngerPersons = { youngerPerson1.concat(youngerPerson1),
		// youngerPerson2.formatted(youngerPerson2.split(youngerPerson2, 0)),
		// youngerPerson3.formatted(youngerPerson3.split(youngerPerson3)) };
		// String[] youngerPersons = {youngerPerson1, youngerPerson2, youngerPerson3};
		String[] youngerPersons = youngerPerson1.split("\\s");
		if (youngerPersons != null) {
			// System.out.println(youngerPerson1 + youngerPerson2 + youngerPerson3);
			System.out.println(youngerPersons);
		}
	}
}
// String youngerPerson3 = actions.makePersonYoungerValidOnly("Onas Onukas
// klm5465456 1990 vyr");
// if (youngerPerson3 != null) {
// System.out.println(youngerPerson3);

// String youngerPerson1 =
// actions.makePersonYoungerValidOnly(youngerPerson.split(youngerPerson, 0));
// String[] p.PersonMain.main(args);
// Person[] p =
// {actions.makePersonYoungerValidOnly(youngerPerson.split(youngerPerson, 0))};

// String youngerPerson1 = "Jonas" + "Jonaitis" + "123456789" + "1991" + "vyr";
// String [] persons = {(actions.makePersonYoungerValidOnly(youngerPerson1)),
// (actions.makePersonYoungerValidOnly(youngerPerson)) };
// String [] persons1 = youngerPerson.split(youngerPerson1, 0);
// if (persons1 != null) {
// System.out.println(persons1);
// PersonActions actions = new PersonActions();

// String youngerPerson2 = actions.makePersonYoungerValidOnly("Ona Onyte 5465456
// 1990 vyr");
// if (youngerPerson2 != null) {
// System.out.println(youngerPerson2);

// }

//}
