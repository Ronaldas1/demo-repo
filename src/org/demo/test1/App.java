package org.demo.test1;

public class App {
    public static void main(String[] args) {
        Integer a = Integer.parseInt(args[0]);
        a = a+1;
        Example3 pavyzdziai = new Example3();
        pavyzdziai.isvesk(10);
        pavyzdziai.isvesk(a);

    }
}
