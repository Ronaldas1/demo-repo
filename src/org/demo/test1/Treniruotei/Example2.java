package org.demo.test1.Treniruotei;

//Turim metodą, kuris patikrina ar paduotas skaičius yra lyginis. Tarkim, prireikė turėti metodą arNelyginis().
class Main {
    public static void main(String[] args) {
        boolean p1p2 = true;
        boolean p1p3 = true;
        boolean p2B = true;
        boolean Ap1 = true;
        boolean Ap4 = true;
        boolean p3p5 = false;
        boolean p4p5 = false;
        boolean p5B = true;
        boolean p6p5 = false;
        boolean AB = true;
        System.out.println(Ap1 == p1p2 == p2B );
        System.out.println(Ap1 == p1p3 == p3p5 == p5B);
        System.out.println( AB == (Ap1 = p1p2 = p2B));
        System.out.println(AB == (Ap4 == p4p5 == p5B));
        System.out.println(AB == (Ap1 == p3p5 == p5B));
        System.out.println(AB == (Ap4 == p4p5 == p6p5 == p5B));
        System.out.println(AB ^Ap4 == p4p5 == p6p5 == p5B);



        //tokiu budu sudeciau visa masruta is A per p iki B.

    }


        //int x = 10;
        //int y = 9;
        //System.out.println(x > y);
        //System.out.println(x % 2 == 0);
    //}

    public static class Bridges {
        //public boolean getway(
            //boolean p1p2 = true;
            //boolean p1p2 = true;


        //return Ap1 && p1p2 && p2B == true;
            }
        }





    //}
    //int c = 6;
    //private boolean arNelyginis  (int sk){
    //int c = 6;
    //boolean c = true;
    //boolean arNelyginis = c % 2 == 0;
    //System.out.println(c / 2 ==0);
    //return c % 2 == 0;
//}

