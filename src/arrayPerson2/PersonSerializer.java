package arrayPerson2;

//import com.sun.java.swing.plaf.windows.TMSchema.TypeEnum;

public class PersonSerializer {
	// "Ona Onute 4485465456 1984 mot"
	// "Vardas Pavarde 3485465456 1984 vyr"
	// "Algis Antanas Şigas 3485465456 1984 vyr"
	public Person personFromString(String dataInString) {
		Person result = new Person();

		String[] splited = dataInString.split(" ");

		if (splited.length == 5) {
			result.setVardas(splited[0]);
			result.setPavarde(splited[1]);
			result.setAk(splited[2]);
			result.setGimMetai(Integer.parseInt(splited[3]));
			result.setLytis(Lytis.valueOf(splited[4].toUpperCase()));
		} else {
			result.setVardas(splited[0] + " " + splited[1]);
			result.setPavarde(splited[2]);
			result.setAk(splited[3]);
			result.setGimMetai(Integer.parseInt(splited[4]));
			result.setLytis(Lytis.valueOf(splited[5].toUpperCase()));
		}

		return result;
	}

	public Person personFromString2(String dataInString) {
		Person result = new Person();

		String[] splited = dataInString.split(" ");

		int i = 0;
		result.setVardas(splited[i++] + (splited.length == 6 ? " " + splited[i++] : ""));
		result.setPavarde(splited[i++]);
		result.setAk(splited[i++]);
		result.setGimMetai(Integer.parseInt(splited[i++]));
		result.setLytis(Lytis.valueOf(splited[i++].toUpperCase()));

		return result;
	}

	public String stringFromPerson(Person x) {

		return x.getVardas() + " " + x.getPavarde() + " " + x.getAk() + " " + x.getGimMetai() + " " + x.getLytis();
	}

	

	public Person[] validBatchConverter(String[] persons) {
		return null;
	}
}
