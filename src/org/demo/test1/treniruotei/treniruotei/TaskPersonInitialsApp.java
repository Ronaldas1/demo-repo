package org.demo.test1.treniruotei.treniruotei;

import org.demo.test1.treniruotei.TaskPersonInitials;

public class TaskPersonInitialsApp {
    public static void main(String[] args) {
        TaskPersonInitials initials = new TaskPersonInitials();

        String rezultatas = initials.makeInitials("Jonas", "Jonaitis");
        System.out.println(rezultatas);
        rezultatas = initials.makeInitials("daRius", "petraitis");
        System.out.println(rezultatas);
    }

}
