package org.demo.test1.treniruotei.treniruotei;

public class Treniruotei_0102_2 {

	private boolean arLyginis(int sk) {

		return sk % 2 == 0;
	}

	private boolean arNelyginis1(int sk) {

		// ?
		return sk % 2 ==1;
		
	}
	private boolean arNelyginis2(int sk) {

		// ?
		
		return sk % 2 !=0;
	}
	private boolean arNelyginis3(int sk) {

		// ?
		
		return ! arLyginis(sk);
	}
}
