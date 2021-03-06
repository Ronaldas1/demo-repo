package arrayPerson2;

public class PersonActions {

	public void makePersonYounger(int years, Person p) {

		p.setGimMetai(p.getGimMetai() + years);

	}

	public boolean isItValid(Person p) {

		if (p.getGimMetai() < 1900) {
			return false;
		}
		if (p.getGimMetai() > 2020) {
			return false;
		}
		//patikrinti asm kodas ne trumpesnis negu 5 simboliai, ne ilgesnis 20 simboliu
		//vardas ne maziau 3 simboliu, pavarde taip pat, vardas gali buti ne 1
		//ar lytis atitinka pavarde
		// 
		return true;
	}

}
