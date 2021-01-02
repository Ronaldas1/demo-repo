package org.demo.test1.treniruotei.treniruotei;

import org.demo.test1.dD2Pamoka.person.Asmuo;
import org.demo.test1.treniruotei.TaskPersonInitials;

public class TaskPersonInitialsApp {
	public static void main(String[] args) {
		TaskPersonInitials initials = new TaskPersonInitials();

		Asmuo jonaitis = new Asmuo();
		jonaitis.setVardas("Jonas");
		jonaitis.setPavarde("Jonaitis");

		String rezultatas = initials.makeInitials(jonaitis);
		System.out.println(rezultatas);
		// rezultatas = initials.makeInitials("Petraitis");
		// System.out.println(rezultatas);
	}

	private void suma() {
		// TODO Auto-generated method stub

	}
}
