package sultys;

public class Sultys1 {

	public boolean arNeraLikucio1(int sulciuKiekisViso, int talposTuris) {
		 
		return (sulciuKiekisViso % talposTuris) == 0;
	}
	public boolean arNeraLikucio2(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {
		 
		return (sulciuKiekisViso % talposTuris) == 0;
		
	}
	public boolean arNeraLikucio3(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis, boolean ispilstytuTalpuKiekis) {
		ispilstytuTalpuKiekis = ((sulciuKiekisViso % talposTuris)%2) == 0; 
		return ispilstytuTalpuKiekis;
		
	}
}
