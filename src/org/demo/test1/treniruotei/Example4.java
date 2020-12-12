package org.demo.test1.treniruotei;

public class Example4 {
    public static void main(String[] args) {

        int sulciuKiekisViso = 10;
        int talposTuris = 3;
        int arNeraLikucio = 0;
        boolean reikalingasTikLyginis = true;
    }

    private boolean Sultys(int sulciuKiekisViso,
                           int talposTuris,
                           boolean reikalingasTikLyginis) {
        //return sulciuKiekisViso % talposTuris == 3;
        //return sulciuKiekisViso / talposTuris == 0;
        System.out.println(sulciuKiekisViso / talposTuris == 0);
        return reikalingasTikLyginis;
    }

    private int arLyginis(int sulciuKiekisViso,
                          int talposTuris) {
        //return sulciuKiekisViso / 3 == 0;
        System.out.println(sulciuKiekisViso / talposTuris == 0);
        return 10 / 3;

    }

    private void Sultys1(int sulciuKiekisViso,
                         int talposTuris) {
        //return sulciuKiekisViso % talposTuris == 0;
        System.out.println(sulciuKiekisViso % talposTuris == 0);
    }

    private void Sultys2(int sulciuKiekisViso,
                         int talposTuris,
                         boolean reikalingasTikLyginis,
                         int arNeraLikucio) {
        //return sulciuKiekisViso / talposTuris == arNeraLikucio;
        System.out.println(sulciuKiekisViso / talposTuris == arNeraLikucio);
    }
}
