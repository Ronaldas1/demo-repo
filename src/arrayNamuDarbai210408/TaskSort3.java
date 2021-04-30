package arrayNamuDarbai210408;

public class TaskSort3 {

	public static void main(String[] args) {
		int[] us = { 5, 3, 1, 2, 4 };
		int x = 0;
		if (us[0] > us[1]) {
			x = us[1];
			us[1] = us[0];
			us[0] = x;
		}
		if (x == us[1]) {
			us[1] = us[0];
		}
		if (us[1] > us[0]) {
			x = 0;
		}
		if (us[1] > us[2]) {
			x = us[2];
			us[2] = us[1];
			us[1] = x;
		}
		if (x == us[2]) {
			us[2] = us[1];
		}
		if (us[2] > us[1]) {
			x = 0;
		}
		if (us[2] > us[3]) {
			x = us[3];
			us[3] = us[2];
			us[2] = x;
		}
		if (x == us[3]) {
			us[3] = us[2];
		}
		if (us[3] > us[2]) {
			x = 0;
		}
		if (us[3] > us[4]) {
			x = us[4];
			us[4] = us[3];
			us[3] = x;
		}
		if (x == us[4]) {
			us[4] = us[3];
		}
		if (us[4] > us[3]) {
			x = 0;
		}
		if (us[0] > us[1]) {
			x = us[1];
			us[1] = us[0];
			us[0] = x;
		}
		if (x == us[1]) {
			us[1] = us[0];
		}
		if (us[1] > us[0]) {
			x = 0;
		}
		if (us[1] > us[2]) {
			x = us[2];
			us[2] = us[1];
			us[1] = x;
		}
		if (x == us[2]) {
			us[2] = us[1];
		}
		if (us[2] > us[1]) {
			x = 0;
		}
		if (us[2] > us[3]) {
			x = us[3];
			us[3] = us[2];
			us[2] = x;
		}
		if (x == us[3]) {
			us[3] = us[2];
		}
		if (us[3] > us[2]) {
			x = 0;
		}

		// System.out.println(us);
		System.out.println(us[0]);
		System.out.println(us[1]);
		System.out.println(us[2]);
		System.out.println(us[3]);
		System.out.println(us[4]);
		System.out.println(" x = " + x);
	}
}
