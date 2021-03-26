package arrayNamuDarbai;

import java.lang.reflect.Array;

public class TaskAverage1_2 {
	public double calcAverage(double[] data) {
		// TODO ...
		double[] data1 = { 1.25, 3.16, 15.898 };
		double sum = Array.getDouble(data1, 0);
		return (double) sum / data1.length;
	}

	public static void main(String[] args) {
		double[] data1 = new double[] { 1.25, 3.16, 15.898 };
		double sum = 0;
		for (double i : data1)
			sum += i;
		double size = data1.length;
		double average = sum / size;
		// return (double) sum / data1.length;
		System.out.println(sum);
		System.out.println(size);
		System.out.println(average);

	}

}
