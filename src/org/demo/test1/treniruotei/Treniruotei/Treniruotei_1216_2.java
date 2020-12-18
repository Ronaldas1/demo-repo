package org.demo.test1.treniruotei.Treniruotei;

public class Treniruotei_1216_2 {
    public void fullThrottle() {
        Treniruotei_1216_1 fullThrottle = new Treniruotei_1216_1();
        System.out.println("The car is going very fast");

    }

    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);

    }

    public void doors(int allDoors) {
        System.out.println("The doors are " + allDoors);
    }


        public static void main (String[]args){
            Treniruotei_1216_1 myCar = new Treniruotei_1216_1();
            myCar.fullThrottle();
            myCar.speed(201);
            myCar.doors(2);
        }

    }
