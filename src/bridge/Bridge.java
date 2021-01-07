package bridge;

public class Bridge {

	public void getWay() {

		boolean p1 = true;
		boolean p2 = true;
		boolean p3 = false;
		boolean p4 = true;
		boolean p5 = true;
		boolean p6 = false;
		// return p1 && p2;
		// return p4 && p5;
		// return p4 && p6 && p5;
		// return p1 && p3 && p5;
		System.out.println(p1 && p2);
		System.out.println(p4 && p5);
		System.out.println(p4 && p6 && p5);
		System.out.println(p1 && p3 && p5);

	}
}
