package arrayPerson2;

public class PersonData {
	public Person personFromString(String strPerson) {
		// TODO
		// Person person1 = new Person ();
		// String id = person.getId();
		// this.Id = person1;
		// String id = this.Id();
		// String[]person = {id + vardas + pavarde + ak + gimMetai + lytis};
		// String person = person1;
		// Hint: String.split()
		// Hint: Integer.parseInt()
		// System.out.println("PersonData.personFromString()");

		// System.out.println(Person.split(strPerson));
		// System.out.println(Person.class);
		Person persona = new Person();
		// String id = this.Id;
		persona.setId("4485465456");
		persona.setVardas("Ona");
		persona.setPavarde("Onute");
		persona.setAk("4485465456");
		persona.setGimMetai(1994);
		Lytis.valueOf("MOT");
		persona = personFromString(strPerson);
		strPerson = "id" + "vardas" + "pavarde" + "ak" + "gimMetai" + "lytis";
		Integer gimMetai = Integer.parseInt("gimMetai"); 
		System.out.println(Integer.parseInt("4485465456" + "1994"));
		System.out.println(strPerson.split(strPerson));
		return null;
	}
}
