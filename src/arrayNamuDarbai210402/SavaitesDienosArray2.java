package arrayNamuDarbai210402;

public class SavaitesDienosArray2 {
	public String weekDayToStr(int i) {

//		Paraðykite metodà konvertuojantá skaièiø á savaitës dienas þodþiais.
//		Padarykit 2 variantus:Su masyvu.Su enum’u.
//		Pvz.: 5 -> "penktadienis"

		int[] savDienos = { 1, 2, 3, 4, 5, 6, 7 };
		// int d = 0;
		// if (i > 0 && i < 8) {
		// System.out.println(savDienos[i - 1]);
		// System.out.println(savDienos.toString());
		// return savDienos[i - 1];
		for (int i1 = 0; i1 < savDienos.length; i1 = i1 + 1) {
			System.out.println(savDienos[i1]);
			System.out.println(savDienos.toString());
			// System.out.println(savDienos[1]);
		}
		return "";
	}

	public static void main(String[] args) {
		SavaitesDienosArray2 savDiArr = new SavaitesDienosArray2();
		int[] savDienos = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(savDiArr.weekDayToStr(0).toString());
		System.out.println(savDiArr.toString());
		System.out.println(savDiArr.weekDayToStr(3));

	}
}
