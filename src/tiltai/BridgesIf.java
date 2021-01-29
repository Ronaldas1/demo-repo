package tiltai;

public class BridgesIf {
	public String getShortestWay(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {

		// boolean way1 = p1 && p2;
		// boolean way2 = p1 && p3 && p5;
		// boolean way3 = p4 && p3 && p2;
		// boolean way4 = p4 && p5;
		// boolean way5 = p4 && p6 && p2;
		// return way1 || way2 || way3 || way4 || way5;
		// return "Shortest way";
		// return "";
		// System.out.println(p1, p2, p3, p4, p5, p6);

		if (p1 = true) {
			return "p1";
		} else if (p2 = true) {
			return "p2";
		} else if (p3 = false) {
			return "netinka";
		} else if (p4 = true) {
			return "p4";
		} else if (p5 = true) {
			return "p5";
		} else if (p6 = false) {
			return "netinka";
		} else {
			return "Kelio nera";
		}
	}
}
