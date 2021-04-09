package arrayNamuDarbai210408A;

public class TaskSort1Step {
	public int[] sort(String data, boolean ascending) {
		//TODO …"3242 43 22222 34 1111111 234 234"
		return null;
		}
	public static void main(String[] args) {
		String str = "3242 43 22222 34 1111111 234 234";
		String[] strArray = str.split(" ");
		int[] intArray = new int[strArray.length];
		for(int i=0; i< strArray.length; i++) {
		 intArray[i] = Integer.parseInt(strArray[i]);
		System.out.println(str);
		System.out.println(intArray[i]);
		}
	}

}
