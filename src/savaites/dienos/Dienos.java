package savaites.dienos;

public class Dienos {
	public String weekDayToStr(int i) {
		// TODO
		if (i == 1) {
			return "Pirmadienis";
		} else if (i == 2) {
			return "Antradienis";
		} else if (i == 3) {
			return "Treciadienis";
		} else if (i == 4) {
			return "Ketvirtadienis";
		} else if (i == 5) {
			return "Penktadienis";
		} else if (i == 6) {
			return " Sestadienis";
		} else if (i == 7) {
			return "Sekmadienis";
		} else {
			return "Kita savaite";
		}

	}

}
