package arrayNamuDarbai;

import java.util.Arrays;

public class SavaitesDienos20210322 {

	public String weekDayToStr(int i) {

		int[] i1 = { 1, 2, 3, 4, 5, 6, 7 };

		int value = i1[i++];

		String x = Arrays.toString(i1);

		if (i == i1[0]) {
			return "Pirmadienis";
		}
		if (i == i1[1]) {
			return "Antradienis";
		}
		if (i == i1[2]) {
			return "Treciadienis";
		}
		if (i == i1[3]) {
			return "Ketvirtadienis";
		}
		if (i == i1[4]) {
			return "Penktadienis";
		}
		if (i == i1[5]) {
			return "Sestadienis";
		}
		if (i == i1[6]) {
			return "Sekmadienis";
		} else {

			return "Kita savaite";
		}
	}

	public static void main(String[] args) {
		SavaitesDienos20210322 y = new SavaitesDienos20210322();

		System.out.println(y.weekDayToStr(0));
		System.out.println(y.weekDayToStr(3));
		System.out.println(y.weekDayToStr(7));
	}
}
