package array;

public class Test1 {
	public static void main(String[] args) {
		int sk = 10;
		int[] sk1 = { 1, 2, 3, 4, 5 };
		Namas numeris3 = new Namas();
		Namas[] metuGatve = { new Namas(), new Namas(), numeris3 };
		Namas[][] miestas = { metuGatve, null, { new Namas(), null,  new Namas() } };
		miestas[1] = metuGatve;
		System.out.println(miestas[1][1]);
		miestas[1][1] = new Namas();
		System.out.println(miestas[1][1]);
	}

}

class Namas {

}