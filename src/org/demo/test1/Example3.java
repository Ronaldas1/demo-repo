package org.demo.test1;

public class Example3 {
    public static void main(String[] args) {

        class KitaMano {
            public int isveskResult() {
                int a = 10;
                int b = a + 5;
                System.out.println(isveskResult());
                return isveskResult();
            }
            // uzd pitagoro formule
            int pitagoroFormule(int a, int b, int c) {
                a = 5;
                b = 3;
                c = (a * a) + (b * b);
                int c1 = c;
                return c;
            }

            class Mano {
                int isvesk(int c1) {
                    System.out.println(c1);
                    return isvesk(c1);
                }

            }
                //uzd skaiciuotuvas
            class Mano2 {
                int a1 = 7;
                int b1 = 6;

                int suma(int a1, int b1) {

                    int suma = a1 + b1;
                    return suma;
                }
//                int konversija (int suma) {
//                    int konversija = int suma - a1;
//                    return konversija;
//
//                }
            }
        }
    }
}





