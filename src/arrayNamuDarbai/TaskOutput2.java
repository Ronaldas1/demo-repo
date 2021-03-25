package arrayNamuDarbai;

public class TaskOutput2 {
	public void toConsole(int[][] arr) {
		// TODO stulpeliai ir eilutes
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };
	}

	public static void main(String[] args) {
		int[][] arr2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++)

				System.out.println(arr2[i][x] + " ");
			//System.out.println(arr2[i][x] + " ");
			System.out.println();
		}
	}
}
