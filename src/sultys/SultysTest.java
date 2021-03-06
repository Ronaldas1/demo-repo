package sultys;

public class SultysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sultys1 algoritmas = new Sultys1();
		
		//System.out.println(algoritmas.arNeraLikucio1(10, 3));
		//System.out.println(algoritmas.arNeraLikucio1(12, 3));
		System.out.println(algoritmas.arNeraLikucio2(10, 3, true ));//false
		System.out.println(algoritmas.arNeraLikucio2(10, 3, false ));//false
		System.out.println(algoritmas.arNeraLikucio2(12, 3, true));//rez 4,true  
		System.out.println(algoritmas.arNeraLikucio2(12, 3, false));//rezultatas 4,true
		System.out.println(algoritmas.arNeraLikucio2(12, 4, true));//rez 3, grazinti false
		System.out.println(algoritmas.arNeraLikucio2(12, 4, false));//rez 3, grazinti true
		//System.out.println(algoritmas.arNeraLikucio3(12, 3, true, true));
		//System.out.println(algoritmas.arNeraLikucio3(10, 3, true, true));
	}

}
