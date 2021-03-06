package arrayNamuDarbai;

public class SavaitesDienos {
	public String weekDayToStr(int i) {
		//public static void main(String[] args) {
		// TODO
		// String weekDayToStr[] = {"1"+"2"+"3"+"4"+"5"+"6"+"7"};
		int i1[] = { 1 + 2 + 3 + 4 + 5 + 6 + 7 };
		System.out.println(i1.toString());
		return "";
	}

	public enum SavDienos {
		Pirmadienis, Antradienis, Treciadienis, Ketvirtadienis
	}

	SavDienos[] dienos = SavDienos.values();
	// System.out.println("Savaites dienos" + dienos));
	// System.out.println(SavDienos.values());

}

