package arrayNamuDarbai;

public class QuizMatrica {
	public static void main(String[] args) {
		int[][] matrix = new int[3][2];
		// Nor�dami pasiekti pat� paskutin� element�
		// (paskutinio stulpelio paskutin�s eilut�s)
		// u�ra�ytume: matrix[2][1]
		// bet kaip para�yti universaliai, kad veikt� su bet kokiais matmenimis?

		// Pakeiskime t� paskutin� reik�m�, kad ji b�t� visada kaip ir pati pirmoji.

		int size = matrix.length;
		int value = matrix[-1][-1];
		int size2 = matrix[-1][-1];
		System.out.println(matrix.length);
		System.out.println(matrix[-1][-1]);

	}
}
