package arrayNamuDarbai210408;

public class TaskSort5 {
	public static void main(String[] args) {
		// selection sorting 2 - Neteisingas, neveikia !
		// int[] us = { 10, 3, 100, -2, 4999, -1000 };
		int[] us = { 6, 5, 3, 4, 1, 2 };
		boolean swap = false;
		boolean asc = true;
		do {
			// 1,2,3...
			swap = false;
			for (int i = 0; i < us.length; i++) {
				int temp = i;
				for (int j = i + 1; j < us.length; j++) {
					if (!asc && (us[i] > us[j])) {
						temp = us[i];
						us[i] = us[j];
						us[j] = temp;
						swap = true;
					}
					
					}
					// for (i = 0; i < us.length; i++) {
					// System.out.println(us[0]);
					// System.out.println(us[1]);
					// System.out.println(us[2]);
					// System.out.println(us[3]);
					// System.out.println(us[4]);
					// System.out.println(us[5]);

				}
			} while (swap);
		 
		for (int v : us) {
			System.out.println(v);
		}

	}
}

//}
