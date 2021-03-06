package arrayPersonData;

public class PersonFromString2 {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	public class PersonData {
		

		public Person personFromString2(String person) {
			Person persona = new Person();

			persona.setId("4485465456");
			persona.setVardas("Ona");
			persona.setPavarde("Onute");
			persona.setAk("");
			persona.setGimMetai(1994);
			// persona.setLytis("MOT");
			Lytis.valueOf("MOT");
			persona = personFromString2(person);

			person = "id" + "vardas" + "pavarde" + "ak" + "gimMetai" + "lytis";
			person.split(person);
			System.out.println(person.split(person));
			Integer gimMetai1 = Integer.parseInt("gimMetai");
			System.out.println(Integer.parseInt("4485465456" + "1994"));
			System.out.println(Integer.parseInt("3485465456" + "1984"));
			// System.out.println(String.split(Ona, Onute, 4485465456, 1984, mot));
			// person = Integer.parseInt("gimMetai");
			class StringSplit {
				public void main(String[] args) {
					String persona = "";
					String[] arrSplit = persona.split("4485465456, Ona, Onute, 1994, MOT ");
					for (int i = 0; i < arrSplit.length; i++) {
						System.out.println(arrSplit[i]);
					}
				}
			}
			return null;
		}
	}

}
