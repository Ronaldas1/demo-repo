package org.demo.test1.treniruotei;

public class Example5 {
    private int skaicius = 5;


    public void printSk(int i) {
        System.out.println(i);
    }

    private int skaicius(int sk1) {
        int sk2 = -2;
        sk2 = sk2 + skaicius + sk1;
        System.out.println(sk2);
        return sk2;

    }

    private int skaicius1(int sk1) {
        int sk3 = 6;
        int sk4 = 7;
        sk3 = sk3 * skaicius + sk1;
        sk4 = sk1 + sk3 + skaicius;
        System.out.println(sk1);
        System.out.println(sk3);
        System.out.println(sk4);
        return sk1 + sk3 + sk4;
    }

    private int skaicius2(int sk1) {
        boolean sk2 = true;
        boolean sk3 = true;
        skaicius2(10 + 11);
        return sk1;
    }

    public void isveskSuma(int sk1) {
        int sk2 = -2;
        sk2 = sk2 + skaicius + sk1;
        System.out.println(sk2);
        System.out.println(skaicius);
    }

    /*public static class Mano {

        private int skaicius2 = 15;
        private int skaicius3 = 16;

        public void isveskSuma(int sk1) {
            int sk2 = -10;
            sk2 = sk2 + skaicius2;
            System.out.println(sk2);
            System.out.println(skaicius3);

        }

        public <KitaMano> void pridek10(int pradinis) {
            KitaMano k1 = new KitaMano();
            k1.isvesk(pradinis + 10);
        }
    }

    public static class KitaMano {
        public void isvesk(int skaicius) {
            System.out.println(sk1);
        }
    }*/
}
