package array;

public class ForCiklas {
	public static void main(String[] args) {

		String[] vardai =  { "Martynas", "Tomas" };
		if (vardai != null) {
			for (int i = vardai.length - 1; i >= 0; --i) {
				System.out.println("Vardas    : " + vardai[i]);
			}

			System.out.println(" ------------ ");

			for (int i = vardai.length; i > 0;) {
				System.out.println("Vardas    : " + vardai[--i]);
			}

			System.out.println(" ------------ ");

			for (int i = 0; i < vardai.length; i++) {
				System.out.println("Vardas    : " + vardai[vardai.length - 1 - i]);
			}
		}
	}
}