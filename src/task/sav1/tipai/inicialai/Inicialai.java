package task.sav1.tipai.inicialai;

public class Inicialai {

	public String pagamink(Asmuo asm) {

		String vardas = asm.getVardas();
		String pavarde = asm.getPavarde();
		 vardas = vardas.toLowerCase();
		 vardas = vardas.toUpperCase() + vardas.charAt(0);
		 pavarde = "" + pavarde.charAt(0);
		 pavarde = pavarde.toUpperCase();
		return vardas + pavarde;
	}

}
