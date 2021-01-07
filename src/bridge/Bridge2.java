package bridge;

public class Bridge2 {

	public boolean getWay = true;

	public boolean Result(boolean result1, boolean result2, boolean result3, boolean result4) {

		boolean p1 = true;
		boolean p2 = true;
		boolean p3 = false;
		boolean p4 = true;
		boolean p5 = true;
		boolean p6 = false;

		result1 = p1 && p2;
		result2 = p4 && p5;
		result3 = p4 && p6;
		result4 = p1 && p3;

		return result1;
		//return result2;
		//return result3;
		//return result4;

	}
}
