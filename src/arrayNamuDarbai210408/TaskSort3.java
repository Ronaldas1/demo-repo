package arrayNamuDarbai210408;

public class TaskSort3 {
//bubble sorting
	TaskSort1 TaskSort3 = new TaskSort1(); 
	public static void main(String[] args) {
		//int[] us = { 10, 3, 100, -2, 4999, -1000 };
		int[] us = { 3242, 43, 22222, 34, 1111111, 234, 234 };
		// int x = 0;
		boolean swap = false;
		// a,b...
		boolean asc = true;
		
		do {
			// 1,2,3...
			swap = false;
			for (int i = 0; i < us.length - 1; i++) {
				if (!asc &&(us[i] < us[i + 1])) {
					int temp = us[i + 1];
					us[i + 1] = us[i];
					us[i] = temp;
					swap = true;
				}
				if (asc &&(us[i] > us[i + 1])) {
					int temp = us[i + 1];
					us[i + 1] = us[i];
					us[i] = temp;
					swap = true;
				}
			}
		} while (swap);
		
		// ---a1
//		if (us[0] > us[1]) {
//			x = us[1];
//			us[1] = us[0];
//			us[0] = x;
//		}
//		if (x == us[1]) {
//			us[1] = us[0];
//		}
//		if (us[1] > us[0]) {
//			x = 0;
//		}
//		//---a2
//		if (us[1] > us[2]) {
//			x = us[2];
//			us[2] = us[1];
//			us[1] = x;
//		}
//		if (x == us[2]) {
//			us[2] = us[1];
//		}
//		if (us[2] > us[1]) {
//			x = 0;
//		}
//		//---a3
//		if (us[2] > us[3]) {
//			x = us[3];
//			us[3] = us[2];
//			us[2] = x;
//		}
//		if (x == us[3]) {
//			us[3] = us[2];
//		}
//		if (us[3] > us[2]) {
//			x = 0;
//		}
//		//---a4
//		if (us[3] > us[4]) {
//			x = us[4];
//			us[4] = us[3];
//			us[3] = x;
//		}
//		if (x == us[4]) {
//			us[4] = us[3];
//		}
//		if (us[4] > us[3]) {
//			x = 0;
//		}
//		//---b1
//		if (us[0] > us[1]) {
//			x = us[1];
//			us[1] = us[0];
//			us[0] = x;
//		}
//		if (x == us[1]) {
//			us[1] = us[0];
//		}
//		if (us[1] > us[0]) {
//			x = 0;
//		}
//		//---b2
//		if (us[1] > us[2]) {
//			x = us[2];
//			us[2] = us[1];
//			us[1] = x;
//		}
//		if (x == us[2]) {
//			us[2] = us[1];
//		}
//		if (us[2] > us[1]) {
//			x = 0;
//		}
//		//---b3
//		if (us[2] > us[3]) {
//			x = us[3];
//			us[3] = us[2];
//			us[2] = x;
//		}
//		if (x == us[3]) {
//			us[3] = us[2];
//		}
//		if (us[3] > us[2]) {
//			x = 0;
//		}

		// System.out.println(us);
		
		for (int v : us) {
			System.out.println(v);	
		}
	}
}
