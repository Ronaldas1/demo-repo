package arrayNamuDarbai;

public class QuizMatrica {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		// Norëdami pasiekti patá paskutiná elementà
		// (paskutinio stulpelio paskutinës eilutës)
		// uþraðytume: matrix[2][1]
		// bet kaip paraðyti universaliai, kad veiktø su bet kokiais matmenimis?

		// Pakeiskime tà paskutinæ reikðmæ, kad ji bûtø visada kaip ir pati pirmoji.

		int size = matrix.length;
		int value = matrix[-1][-1];
		int size2 = matrix[-1][-1];
		System.out.println(matrix.length);
		System.out.println(matrix[-1][-1]);

	}
}
