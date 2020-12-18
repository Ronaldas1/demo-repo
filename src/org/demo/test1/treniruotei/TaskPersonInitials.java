package org.demo.test1.treniruotei;

public class TaskPersonInitials {
    public static void vardas() {
        System.out.println("Jonas");
    }

    public static void pavarde() {
        System.out.println("Jonaitis");

    }

    public static void asmensKodas() {
        System.out.println(123456789);
    }

    public static void gimimoMetai() {
        System.out.println(2002);
    }

    public static void lytis() {
        System.out.println("vyras");
    }

    public String makeInitials(String vardas, String pavarde) {
        TaskPersonInitials initials = new TaskPersonInitials();
        System.out.println(pavarde.replaceAll("Jonaitis", "J"));
        System.out.println(pavarde.charAt(1));

        return null;
    }

}
