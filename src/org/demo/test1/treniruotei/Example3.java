package org.demo.test1.treniruotei;
//04 pamoka uzd Sultys
public class Example3 {
    public class Main {
        int sulciuKiekisViso = 10;
        int talposTuris = 3;
        int arNeraLikucio = 0;
        boolean reikalingasTikLyginis = true;

        //public int arNeraLikucio(int sulciuKiekisViso,
                                 //int talposTuris,
                                 //boolean reikalingasTikLyginis) {

            //System.out.println(sulciuKiekisViso); talposTuris;);
            //return sulciuKiekisViso / talposTuris;
            //return reikalingasTikLyginis;
            //return sulciuKiekisViso / talposTuris;

        //}
        private boolean Sultys ( int sulciuKiekisViso,
                                 int talposTuris,
                                 boolean reikalingasTikLyginis) {
           //return sulciuKiekisViso % talposTuris == 3;
           return sulciuKiekisViso / talposTuris == 0;
        }
        private boolean arLyginis ( int sulciuKiekisViso) {
            return sulciuKiekisViso / 3 == 0;
        }
        private boolean Sultys1 ( int sulciuKiekisViso,
                                  int talposTuris) {
            return sulciuKiekisViso % talposTuris == 0;
        }
        private boolean Sultys2 (int sulciuKiekisViso,
                                 int talposTuris,
                                 boolean reikalingasTikLyginis,
                                 int arNeraLikucio){
            return sulciuKiekisViso / talposTuris == arNeraLikucio;
        }
        }
    }

