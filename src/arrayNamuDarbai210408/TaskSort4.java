package arrayNamuDarbai210408;

public class TaskSort4 {
//selection sorting 1 veikia
	public static void main(String[] args) {
		 int[] us = { 10, 3, 100, -2, 4999, -1000 };
		//int[] us = { 6, 5, 3, 4, 1, 2 };
		for (int i = 0; i < us.length - 1; i++) {
			int temp = i;
			for (int j = i + 1; j < us.length; j++) {
				if (us[j] < us[temp]) {
					temp = j;//iesko maziausio
				}
				//j = us[temp];
				//us[temp]=us[i];
				//us[i]=j;
			}
			int sN = us[temp];
			us[temp]=us[i];
			us[i]=sN;//swap
			
			//j = us[temp];
			//us[temp]=us[i];
			//us[i]=j;

//			 int temp = i;
//			 if (us[i] < us[temp]) {
//				 i = temp;
			// }
//			if (us[i] < us[i+1]) {
//				us[i] = us[i] + us[i+1];
//				us[i+1] = us[i] = us[i+1];
//				us[i] = us[i] - us[i+1];
//			}

//			if (us[0] > us[1]) {
//				us[0] = us[0] + us[1];
//				us[1] = us[0] - us[1];
//				us[0] = us[0] - us[1];
			// }
//			if (us[1] > us[2]) {
//				us[1] = us[1] + us[2];
//				us[2] = us[0] - us[2];
//				us[1] = us[0] - us[2];
//			}
//			if (us[2] > us[3]) {
//				us[2] = us[2] + us[3];
//				us[3] = us[2] - us[3];
//				us[2] = us[2] - us[3];
//			}
		}
		//System.out.println(us[0]);
		//System.out.println(us[1]);
		//System.out.println(us[2]);
		//System.out.println(us[3]);
		//System.out.println(us[4]);
		//System.out.println(us[5]);
		for (int v : us) {
			System.out.println(v);	
		}
	}
}
