package tiltai;

public class BridgesIfTest {
	public static void name(String[] args) {
		BridgesIf getShortestWay = new BridgesIf();
		boolean p1 = true;
		boolean p2 = true;
		boolean p3 = false;
		boolean p4 = true;
		boolean p5 = true;
		boolean p6 = false;
		boolean getShortestWay1 = p1 && p2;
		boolean getShortestWay2 = p4 && p5;
		boolean getShortestWay3 = p4 && p3 && p2;
		boolean getShortestWay4 = p4 && p6 && p5;
		boolean getShortestWay5 = p4 && p6 && p2;
		boolean getShortestWay6 = p1 && p3 && p5;

		System.out.println(getShortestWay.getShortestWay(p1, p2, p3, p4, p5, p6));
		System.out.println(getShortestWay1);
		System.out.println(getShortestWay2);
		System.out.println(getShortestWay3);
		System.out.println(getShortestWay4);
		System.out.println(getShortestWay5);
		System.out.println(getShortestWay6);
	}

}
