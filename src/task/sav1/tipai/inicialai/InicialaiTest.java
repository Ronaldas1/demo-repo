package task.sav1.tipai.inicialai;

public class InicialaiTest {
	public static void main(String[] args) {
		Inicialai initials = new Inicialai();

		Asmuo jonaitis = new Asmuo();
		jonaitis.setVardas("jONAS");
		jonaitis.setPavarde("jONAITIS");
		Suo brisius = new Suo();
		brisius.setSeimininkas(jonaitis);
		
		GyvunuKontrole grinda = new GyvunuKontrole();
		
		System.out.println("Po suns patikrinimo nustatyta: " +grinda.patikrino(brisius));

		String rezultatas1 = initials.pagamink(jonaitis);
		//String rezultatas2 =initials.toUpperCase() + pavarde.charAt(0);
		// String rezultatas2 = initials.makeInitials(jonaitis);
//		String rezultatas2 = jonaitis.getPavarde();
//		String rezultatas3 = jonaitis.getVardas();
		System.out.println(rezultatas1);
//		System.out.println(rezultatas2);
//		System.out.println(rezultatas2.charAt(0));
//		System.out.println(rezultatas3 + "\t" + (rezultatas2).charAt(0) + ".");
		//System.out.println(rezultatas3.toUpperCase() + "\t" + rezultatas2.toUpperCase());
		// rezultatas = initials.makeInitials("Petraitis");
		// System.out.println(rezultatas);

	}

	//private void suma() {
		// TODO Auto-generated method stub

	}

