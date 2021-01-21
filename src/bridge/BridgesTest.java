package bridge;

public class BridgesTest {
	public static void main(String[] args) {
		Bridges getWay = new Bridges();

		boolean p1 = true;
		boolean p2 = true;
		boolean p3 = false;
		boolean p4 = true;
		boolean p5 = true;
		boolean p6 = false;

		System.out.println(getWay.equals(p1 && p2));
		System.out.println(getWay.equals(p4 && p5));
		System.out.println(getWay.equals(p4 && p3 && p2));
		System.out.println(getWay.equals(p4 && p6 && p5));
		System.out.println(getWay.equals(p1 && p3 && p5));

	}
}
