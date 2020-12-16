package org.demo.test1.treniruotei;

public class Example5App {
    public static void main(String[] args) {
        Example5 objektas = null;//= new Example5();
        int sk = 0;
        objektas.printSk(sk);
        objektas.printSk(++sk);
        objektas.printSk(sk);
        objektas.printSk(sk++);
        objektas.printSk(sk);


    }

}
