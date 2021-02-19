package arrayNamuDarbai;

import java.util.Arrays;

//Paraðykit kodà trims metodams. Juose reikia iðvesti masyvo elementus á konsolæ.

public class TaskOutput {
	// public static void main(String[] args) {
	public void toConsole(int[] arr) {
		// TODO elementai atskirose eilutese
		// public static void main(String[] args) {
		int[] arr1 = {};
		// Arrays.asList(arr);
		System.out.println(Arrays.asList(arr));
	}

	// }
	public void toConsole(int[][] arr) {
		// TODO stulpeliai ir eilutes
		// Arrays.parallelSort(arr);
		// System.out.println(Arrays.parallelSort(arr));
		// Arrays.sort( null, 0, 0);
	}

	public void toConsole(Point[] point) {
		// TODO kiekvienas poin’as atskiroj eilutej
		Arrays.sort(point);
		// System.out.println(Arrays.sort(point));
	}

	class Point {
		private int x;
		private int y;
	}

}
