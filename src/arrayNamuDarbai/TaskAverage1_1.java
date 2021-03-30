package arrayNamuDarbai;

public class TaskAverage1_1 {
	public double calcAverage(double[] data) {
		// TODO ...

		//double[] data1 = {};
		// double sum = 0;
		// for (double value : data1 ) {
		// sum += value;
		//return 0.0;
		double[] data1 =  {2.00, 3.00 };
		double sum = 0;
		for (double value : data1) {
			sum += value;
			//System.out.println(sum += value);
		}
		return sum / data1.length;
		 
		//System.out.println(sum);
		//System.out.println();
	}

	// return sum;

	public static void main(String[] args) {
		TaskAverage1_1 ta1_1 = new TaskAverage1_1(); 
		double[] data1 = new double[] { };
		//double sum = 0;
		//for (double value : data1) {
			//sum += value;
		//}

		//System.out.println(sum);
		//ta1_1.calcAverage(data1);
		
		System.out.println(ta1_1.calcAverage(data1));

	}

}
