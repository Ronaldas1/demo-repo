package task.sav1.tipai.inicialai;

public class Inicialai {

	private static final String TASKAS = ".";
	private static final String TARPAS = " ";

	public String pagamink(Asmuo asm) {

		String vardas = asm.getVardas();
		String pavarde = asm.getPavarde();

		vardas = vardas.substring(0, 1).toUpperCase() + vardas.substring(1, vardas.length()).toLowerCase();
		pavarde = pavarde.substring(0, 1).toUpperCase() + TASKAS;

		return vardas + TARPAS + pavarde;
	}

}

