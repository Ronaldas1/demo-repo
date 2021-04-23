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
	}

	public int[] sortInts(int[] unsorted) {
		int[] data3 = new int[i];
		for (int i = 0; i > i + 1; i++)
			;
		// if (arr[i]>arr[i+1]) {
		if (data3[i] > data3[i + 1]) {
			// return data3[i + 1];
			return i + 1;
		}
	}
	// return unsorted ;

	// }

	public static void main(String[] args) {
		TaskSort1 y = new TaskSort1();
		// System.out.println(Arrays.toString(data3));
		// System.out.println(Arrays.toString(y));
		System.out.println("3242  43  22222  34  1111111  234  234");
		// System.out.println(Arrays.toString("3242 43 22222 34 1111111 234 234"));
	}
}
