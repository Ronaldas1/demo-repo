package savaites.dienos;

public class DienosTipas {
	public String weekDayTypeToStr(int i) {
		// TODO
		if (++i <= 5) {
			return "Darbo diena";
		} else if (i == 6) {
			return "Savaitgalis";
		} else if (i == 7)
			;
		return "Savaitgalis";
	}
}
