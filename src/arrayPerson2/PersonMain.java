package arrayPerson2;

public class PersonMain {
	public static void main(String[] args) {
		PersonData dateParse = new PersonData();
		Person person = dateParse.personFromString2("Ona Onute 4485465456 1984 mot");
		person.setGimMetai(person.getGimMetai() + 10);
		String serializedPerson = dateParse.stringFromPerson(person);
		System.out.println(serializedPerson);
	}

}
