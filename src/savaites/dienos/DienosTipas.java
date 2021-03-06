package savaites.dienos;

public class DienosTipas {
	public String weekDayTypeToStr(int i) {
		if (i < 1 || i > 7 ) {
			return "?";
		}
		if (i < 6) {
			return "Darbo diena";
		} 
			
		return "Savaitgalis";
	}
}
