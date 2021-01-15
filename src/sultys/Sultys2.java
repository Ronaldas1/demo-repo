package sultys;

//public class Sultys2{
//	public int arNeraLikucio (){
//	Sultys1 sultysIspilstyta = new Sultys1();
//	int talpa = 3;
//	int sulciuKiekis = 10;
//	sultysIspilstyta = sulciuKiekis % talpa;
//	return sulciuKiekis % talpa;
//}
	
public class Sultys2{
	Sultys1 rezultatas = new Sultys1();
	int sulciuKiekis = 10;
	int talpa = 3;
	private int arNeraLikucio (int sulciuKiekis) {
		//int siulciuKiekis = 10;
		int rezultatas = sulciuKiekis % talpa;
		return rezultatas;
	}
}
