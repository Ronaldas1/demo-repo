package org.demo.test1.treniruotei;

public class Example1 {

    public void myMethod(String name, int age) {
        System.out.println(name + " Zemaitis" + " is " + age);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();

        obj.myMethod("Jonas", 20);
        obj.myMethod("Darius", 25);
        obj.myMethod("Petras", 30);
        //public static void main(String[] args) {
        //myMethod("Jonas");
        String text = "Zemaitis";
        System.out.print("Darius ");
        System.out.print(text.replaceAll("Zemaitis", "Z."));
    }
}


