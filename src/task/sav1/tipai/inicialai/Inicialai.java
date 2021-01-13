package task.sav1.tipai.inicialai;

public class Inicialai {

	public String pagamink(Asmuo asm) {

		String vardas = asm.getVardas();
		String pavarde = asm.getPavarde();
		// vardas = vardas.toLowerCase()+vardas.substring(1, 5).toUpperCase();
		 vardas = vardas.substring(0,1).toUpperCase()+ vardas.substring(1, 5).toLowerCase()+" "+ pavarde.substring(0,1).toUpperCase()+".";
		//vardas = vardas.substring(0,5).toLowerCase();
		 pavarde = "" + pavarde.charAt(0);
		 //pavarde = pavarde.substring(0,1).toUpperCase(0);
		return vardas ;
	}

	
	}


