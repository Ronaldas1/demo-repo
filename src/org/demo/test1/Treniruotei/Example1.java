package org.demo.test1.Treniruotei;

public class Example1 {
    static void myMethod(String name, int age) {
        System.out.println(name + " Zemaitis" + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Jonas", 20);
        myMethod("Darius", 25);
        myMethod("Petras", 30);
        //public static void main(String[] args) {
        //myMethod("Jonas");
        String text = "Zemaitis";
        System.out.print("Darius ");
        System.out.print(text.replaceAll("Zemaitis", "Z."));
    }
}


