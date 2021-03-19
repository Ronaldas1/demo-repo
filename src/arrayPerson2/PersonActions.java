package arrayPerson2;

public class PersonActions {
	public String makePersonYoungerValidOnly(String string) {
		PersonSerializer serializer = new PersonSerializer();
		Person person = serializer.personFromString2(string);

		if (isItValid(person)) {
			makePersonYounger(11, person);
			return serializer.stringFromPerson(person);

		}
		return null;

	}

	private void makePersonYounger(int years, Person p) {

		p.setGimMetai(p.getGimMetai() + years);

	}

	public boolean isItValid(Person p) {
		if (p.getGimMetai() == null) {
			return false;
		}
		if (p.getAk() == null) {
			return false;
		}
		if (p.getVardas() == null) {
			return false;
		}
		if (p.getPavarde() == null) {
			return false;
		}

		if (p.getGimMetai() < 1900) {
			return false;
		}
		if (p.getGimMetai() > 2020) {
			return false;
		}
		// patikrinti asm kodas ne trumpesnis negu 5 simboliai, ne ilgesnis 20 simboliu
		// vardas ne maziau 3 simboliu, pavarde taip pat, vardas gali buti ne 1
		// ar lytis atitinka pavarde

		if (p.getAk().length() < 5) {
			return false;
		}
		if (p.getAk().length() > 20) {
			return false;
		}
		if (p.getVardas().length() < 3) {
			return false;
		}

		if (p.getPavarde().length() < 3)
			return false;

		if (Lytis.MOT.equals(p.getLytis())) {
			if (!stringEndWith(p.getPavarde(), "yte", "ytë", "aite", "aitë", "iene", "ienë", "ute", "utë", "ë")) {
				return false;
			}
			if (!stringEndWith(p.getVardas(), "ë", "i", "a")) {
				return false;
			}
		}
		if (Lytis.VYR.equals(p.getLytis())) {
			if (!stringEndWith(p.getPavarde(), "is", "us", "as"/* , "s" */ )) {
				return false;
			}
			if (!stringEndWith(p.getVardas(), "s")) {
				return false;
			}
		}
		return true;
	}

	private boolean stringEndWith(String str, String... endings) {

		for (String ending : endings) {
			if (str.endsWith(ending)) {
				return true;
			}
		}
		return false;
	}

}
