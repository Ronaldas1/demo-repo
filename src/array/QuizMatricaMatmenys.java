package array;

import java.util.Arrays;

public class QuizMatricaMatmenys {

	public static void main(String[] args) {
		int[][] matrix = new int[3][2];

//		Turim deklaruota matric�,	kokie jos matmenys?
//		Nor�dami pasiekti	pat� paskutin�	element� 
//		(paskutinio stulpelio paskutin�s eilut�s) u�ra�ytume:
//		matrix[2][1] , bet kaip para�yti universaliai, kad veikt� su bet kokiais matmenimis?
//		Pakeiskime t� paskutin� reik�m�, kad ji b�t� visada kaip ir pati pirmoji.

		// return matrix.length;
		int size = 0;
		size = matrix.length;
		size = matrix[3][0];
		System.out.println(matrix.length);
		System.out.println(matrix.length - 1);
		System.out.println(matrix[2][-1]);
		System.out.println(matrix[-1][-1]);
		System.out.println(matrix[3][0]);
		System.out.println(Arrays.toString(matrix));
		// System.out.println(Arrays.sort(matrix));
		// System.out.println(Arrays.fill(matrix, 2));

	}

}
