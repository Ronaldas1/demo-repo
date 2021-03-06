package array;

import java.util.Arrays;

public class QuizMatricaMatmenys {

	public static void main(String[] args) {
		int[][] matrix = new int[3][2];

//		Turim deklaruota matricà,	kokie jos matmenys?
//		Norëdami pasiekti	patá paskutiná	elementà 
//		(paskutinio stulpelio paskutinës eilutës) uþraðytume:
//		matrix[2][1] , bet kaip paraðyti universaliai, kad veiktø su bet kokiais matmenimis?
//		Pakeiskime tà paskutinæ reikðmæ, kad ji bûtø visada kaip ir pati pirmoji.

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
