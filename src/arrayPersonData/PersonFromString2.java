package arrayPersonData;

//import arrayPersonData.PersonFromString.Person;
import arrayPersonData.PersonFromString1.Lytis;

public class PersonFromString2 {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	public class PersonData {

		public Person personFromString(String person) {
			Person persona = new Person();

			persona.setId("4485465456");
			persona.setVardas("Ona");
			persona.setPavarde("Onute");
			persona.setAk("");
			persona.setGimMetai(1994);
			// persona.setLytis("MOT");
			Lytis.valueOf("MOT");

			person = "id" + "vardas" + "pavarde" + "ak" + "gimMetai" + "lytis";
			person.split(person);
			System.out.println(person);
			Integer gimMetai1 = Integer.parseInt("gimMetai");
			System.out.println();
			// person = Integer.parseInt("gimMetai");

			return null;
		}
	}

}
