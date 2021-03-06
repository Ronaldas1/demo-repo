package savaites.dienos;

public class DienosSwitch {
	public String weekDayToStr(int i) {
		// TODO
		switch (i) {
		case 1:
			return "Pirmadienis";
		case 2:
			return "Antradienis";
		case 3:
			return "Treciadienis";
		case 4:
			return "Ketvirtadienis";
		case 5:
			return "Penktadienis";
		case 6:
			return "Sestadienis";
		case 7:
			return "Sekmadienis";

		}

		return "Savaites pabaiga";
	}
}