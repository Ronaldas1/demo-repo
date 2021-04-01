package arrayNamuDarbai;

public class TaskAverage1_3 {
	public double calcAverage(double[] data) {
		// TODO ...
 double[] dataArray = { 15.8, 11.11, 17.23, 88,99 };
 double sum = 0.0;
 
 for (double num: dataArray) {
	 sum += num;
 }
 double average = sum / dataArray.length;
 System.out.println(average);
		
return average;
}
	public static void main(String[] args) {
		TaskAverage1_3 to1_3 = new TaskAverage1_3();
		double[] dataArray = new double[] {15.8, 11.11, 17.23, 88,99};	
		double sum = 0.0;
		for (double num: dataArray) {
			 sum += num;
		 }
		 double average = sum / dataArray.length;
		 to1_3.calcAverage(dataArray);
		 //to1_3.toConsole(dataArray);
		System.out.println(to1_3.calcAverage(dataArray));
		System.out.println(dataArray);
	}
}
