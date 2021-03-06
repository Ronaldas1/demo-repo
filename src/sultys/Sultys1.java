package sultys;

public class Sultys1 {

	public boolean arNeraLikucio1(int sulciuKiekisViso, int talposTuris) {

		return (sulciuKiekisViso % talposTuris) == 0;
	}

	public boolean arNeraLikucio2(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {

		boolean neraLikucio = (sulciuKiekisViso % talposTuris) == 0;
		boolean talpuKiekisLyginis = ((sulciuKiekisViso / talposTuris) % 2) == 0;
		boolean ijungtasFlag = neraLikucio && talpuKiekisLyginis && reikalingasTikLyginis;
		boolean isjungtasFlag = neraLikucio  && !reikalingasTikLyginis;
		
		return ijungtasFlag || isjungtasFlag;
	}

	public boolean arNeraLikucio3(int sulciuKiekisViso, int talposTuris, boolean reikalingasTikLyginis) {
		boolean ispilstytuTalpuKiekis = ((sulciuKiekisViso % talposTuris) % 2) == 0;
		return ispilstytuTalpuKiekis;

	}
}
