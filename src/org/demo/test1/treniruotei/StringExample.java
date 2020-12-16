package org.demo.test1.treniruotei;

public class StringExample {
    public static void main(String[] args) {
        int i1 = 11;
        String x1 = "10";

        x1 = x1 + "\"kazkoks\"\\ tekstas";
        x1 = i1 + x1;
        System.out.println(x1);
        x1.toUpperCase();
        System.out.println(x1.toUpperCase());
        x1 = x1.toUpperCase();
        System.out.println(x1);
    }
}
