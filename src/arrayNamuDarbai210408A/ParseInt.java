package arrayNamuDarbai210408A;

public class ParseInt {
	// StringSplit y = new StringSplit();
	// int[] intArray = new int[strArray];
//intArray[y] = Integer.
	public static void main(String[] args) {

	}

	String[] strArray = { "3242 43 22222 34 1111111 234 234" };
	int[] intArray = new int[strArray.length];
	{
		for (int i = 0; i < strArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);

		}
		System.out.println(intArray);
		//System.out.println(Integer.parseInt(strArray[]));
	}
}
