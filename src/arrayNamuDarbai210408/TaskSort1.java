package arrayNamuDarbai210408;

import java.util.Arrays;

public class TaskSort1 {
	public int[] sort(String data, boolean ascending) {
		// TODO …"3242 43 22222 34 1111111 234 234"
		String data1 = "3242 43 22222 34 1111111 234 234";
		String[] data2 = data1.split(" ");
		return null;

		// int data2 = data1;
	}

	public int[] dataToInt(String numbersAsText) {
		// int i = Integer.parseInt(data2);
		TaskSort1 dataToInt = new TaskSort1();
		String data1 = "3242 43 22222 34 1111111 234 234";
		String[] data2 = data1.split(" ");
		// int[] data3 = new int[data2.length()];
		int size = data2.length;
		int[] data3 = new int[size];
		for (int i = 0; i < size; i++) {
			data3[i] = Integer.parseInt(data2[i]);
		}
		// int[] data3 = Integer.parseInt(dataToInt);
		// for (int i = 0; i < data2.length(); i++)
		// ;
		// int[] data3 = Integer.parseInt(data2);
		// return Integer.parseInt(numbersAsText);
		// return Integer.parseInt(dataToInt);
		// return Arrays.toString(data3);
		return data3;
		//return dataToInt;
	}

	public int[] sortInts(int[] unsorted) {
		
		TaskSort1 sortInts = new TaskSort1();
		int x = 0;
		if (unsorted[0] > unsorted[1]) {
			x = unsorted[1];
			//return unsorted;
		}
		//if (unsorted[0] < unsorted[1]) {
			//x = unsorted[0];
		//}
		if (unsorted[1] > unsorted[2]) {
			x = unsorted[2];
		}
		//if (unsorted[1] < unsorted[2]) {
			//x = unsorted[1];
		//}
		if (unsorted[2] > unsorted[3]) {
			x = unsorted[3];
		}
		if (unsorted[3] > unsorted[4]) {
			x = unsorted[4];
		}
		if (unsorted[4] > unsorted[5]) {
			x = unsorted[5];
		}
		//if (unsorted[4] < unsorted[5]) {
			//x = unsorted[4];
		//}
		if (unsorted[5] > unsorted[6]) {
			x = unsorted[6];
		}
		if (unsorted[5] < unsorted[6]) {
			x = unsorted[5];
		}

		//return null;
		return unsorted;

	}

	public static void main(String[] args) {
		TaskSort1 y = new TaskSort1();
		TaskSort3 v = new TaskSort3();
		// System.out.println(Arrays.toString(data3));
		// System.out.println(Arrays.toString(y));
		//System.out.println("3242  43  22222  34  1111111  234  234");
		// System.out.println(Arrays.toString("3242 43 22222 34 1111111 234 234"));
		System.out.println (y.dataToInt(null));
		System.out.println(y.sort(null, false));
		System.out.println(y.sortInts(null));
		System.out.println(v.TaskSort3);	
	}
}
