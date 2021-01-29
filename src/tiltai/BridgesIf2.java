package tiltai;

public class BridgesIf2 {
	public String getShortestWay(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {

		if (p1 && p2 == true) {
			return "Shortest way is p1 && p2";

		} else if (p1 && p3 && p5 == false) {
			return "netinka";
		} else if (p4 && p3 && p2 == false) {
			return "netinka";
		} else if (p4 && p5 == true) {
			return "Shortest way is p4 && p5";
		} else if (p4 && p6 && p5 == false) {
			return "netinka";
		} else {
			return "Kelio nera";
		}

	}
}