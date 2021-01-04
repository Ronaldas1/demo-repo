package org.demo.test1.treniruotei.treniruotei;

import org.demo.test1.dD2Pamoka.person.Asmuo;
import org.demo.test1.treniruotei.TaskPersonInitials;

public class TaskPersonInitialsApp {
	public static void main(String[] args) {
		TaskPersonInitials initials = new TaskPersonInitials();

		Asmuo jonaitis = new Asmuo();
		jonaitis.setVardas("Jonas");
		jonaitis.setPavarde("Jonaitis");

		String rezultatas1 = initials.makeInitials(jonaitis);
		//String rezultatas2 = initials.makeInitials(jonaitis);
		String rezultatas2 = jonaitis.getPavarde();
		String rezultatas3 = jonaitis.getVardas();
		System.out.println(rezultatas1);
		System.out.println(rezultatas2);
		System.out.println(rezultatas2.charAt(0));
		System.out.println(rezultatas3 + "\t" +  (rezultatas2).charAt(0)+".");
		System.out.println(rezultatas3.toUpperCase()+ "\t"+ rezultatas2.toUpperCase() );
		// rezultatas = initials.makeInitials("Petraitis");
		// System.out.println(rezultatas);
		
	}

	private void suma() {
		// TODO Auto-generated method stub

	}
}
