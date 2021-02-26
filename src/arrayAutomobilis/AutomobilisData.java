package arrayAutomobilis;

//import arrayPerson2.Person;

public class AutomobilisData {
	public Automobilis automobilisFromString(String dataInString) {
		Automobilis result = new Automobilis ();
		String[] splited = dataInString.split(" ");
		result.setMarke(splited[0]);
		result.setModelis(splited[1]);
		result.setGamybosMetai(Integer.parseInt(splited[3]));
		result.setModelis(dataInString);
		
		return result;
}
}
