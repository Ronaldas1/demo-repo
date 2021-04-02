package arrayNamuDarbai210402;

import java.util.Arrays;

public class SavaitesDienosArray {
	public String weekDayToStr(int i) {
	   	
//		Paraðykite metodà konvertuojantá skaièiø á savaitës dienas þodþiais.
//		Padarykit 2 variantus:Su masyvu.Su enum’u.
//		Pvz.: 5 -> "penktadienis"
		
		int[] savDienos = {1,2,3,4,5,6,7};
		for (int savDiena1 : savDienos) {
			String i1 = Arrays.toString(savDienos);
			
			System.out.println("Siandien yra:  " + savDiena1);
			System.out.println(savDiena1); 
			//System.out.println(i1.valueOf(i));
			System.out.println(savDienos[1]);
			
		}

	return "";
	}

public static void main(String[] args) {
	SavaitesDienosArray savDienAr = new SavaitesDienosArray ();
	int[] savDienos = new int[] {1,2,3,4,5,6,7};
	System.out.println(savDienos.toString());
	System.out.println(savDienAr.toString());
	System.out.println(savDienAr.weekDayToStr(3));
	System.out.println(savDienos[1]);
}
}
