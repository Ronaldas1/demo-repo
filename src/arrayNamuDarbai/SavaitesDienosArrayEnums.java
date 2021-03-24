package arrayNamuDarbai;

import java.util.Arrays;

public class SavaitesDienosArrayEnums {
	public enum weekDayToStr {
		Pirmadienis, Antradienis, Treciadienis, Ketvirtadienis, Penktadienis, Sestadienis, Sekmadienis
	}

	
	weekDayToStr[] dienos = weekDayToStr.values();
//	for ( dienos: weekDayToStr.values()) {
//	   	System.out.println("Miestas : " + miestas);
//	}
	String i = Arrays.toString(dienos);
	
	

	public static void main(String[] args) {

		SavaitesDienosArrayEnums y = new SavaitesDienosArrayEnums();
		for (weekDayToStr dienos: weekDayToStr.values()) {
		System.out.println(y.dienos[0]);
		System.out.println(y.dienos[3]);
		System.out.println(y.dienos[9]);
	}
}
}
