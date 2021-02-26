package arrayPerson2;

//import com.sun.java.swing.plaf.windows.TMSchema.TypeEnum;

public class PersonData {
	// "Ona Onute 4485465456 1984 mot"
	// "Vardas Pavarde 3485465456 1984 vyr"
	// "Algis Antanas Þigas 3485465456 1984 vyr"
	public Person personFromString(String dataInString) {
		Person result = new Person();
		String[] splited = dataInString.split(" ");
		result.setVardas(splited[0]);
		result.setPavarde(splited[1]);
		result.setAk(splited[2]);
		result.setGimMetai(Integer.parseInt(splited[3]));
		result.setLytis(null);
		//result.setLytis(Enum.Parse(splited[4]));
		//result.setLytis(Enum.Parse(typeof(Lytis)));
		//result.setLytis(Enum.Parse(typeof(splited[4])));
		//result.setLytis(Enum.GetNames(typeof(splited[4])));
		//result.setLytis(Lytis[4]);
		//result.setLytis(Enum.Parse(Lytis));
		//result.setLytis(Enum.Lytis);
		//result.setLytis(Enum.Lytis(splited[4]));
		//result.setLytis(Lytis lytis);
		//public static String[] Lytis() {
	        //String test = Arrays.toString(values());
		   // return Lytis.substring(1, Lytis.length()-1).split(", ");
	    //}
		//T[] java.lang.Class.getEnumConstants()
		//result.getLytis();
		//result.setLytis(Enum.valueOf(Lytis.valueOf(dataInString)));
		result.setVardas(splited[+1]);
		//Lytis result1 = new Lytis ();
		result.setLytis(Lytis.KITA);
		result.setLytis(Lytis.MOT);
		result.setLytis(Lytis.VYR);
		//result.setLytis(Lytis.values());
		result.setLytis(Lytis.valueOf(dataInString));
		return result;
	}
}
