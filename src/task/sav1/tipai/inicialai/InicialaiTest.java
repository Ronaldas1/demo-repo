package task.sav1.tipai.inicialai;

public class InicialaiTest {
	public static void main(String[] args) {
		Inicialai initials = new Inicialai();

		Asmuo asmuo1 = new Asmuo();
		asmuo1.setVardas("jONAS");
		asmuo1.setPavarde("jONAITIS");
		Asmuo asmuo2 = new Asmuo();
		asmuo2.setVardas("Ona");
		asmuo2.setPavarde("kruhgsijpl");

		

		System.out.println(initials.pagamink(asmuo1));
		System.out.println(initials.pagamink(asmuo2));

	}

}
