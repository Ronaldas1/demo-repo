package bridge;

public class Bridges {

	public boolean getWay(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {
		boolean way1 = p1 && p2;
		boolean way2 = p1 && p3 && p5;
		boolean way3 = p4 && p3 && p2;
		boolean way4 = p4 && p5;
		boolean way5 = p4 && p6 && p2;
		return way1 || way2 || way3 || way4 || way5;

	}

	/**
	 * veikia negerai, padavus p1 ir p5 grazina true, nors yra false;
	 * 
	 * 
	 * @return
	 */
	public boolean getWay2(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {
		

		return !((!p1 && !p4) || (!p2 && !p5));

	}
}
