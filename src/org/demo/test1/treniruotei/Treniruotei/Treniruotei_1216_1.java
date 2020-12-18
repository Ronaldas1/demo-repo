package org.demo.test1.treniruotei.Treniruotei;

public class Treniruotei_1216_1 {
    public void fullThrottle(){
        System.out.println("The car is going fast!");
        }

    public void speed (int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);

    }

        public void doors (int allDoors){
        System.out.println("The doors are " + allDoors);
    }
    public void consumption (int averageConsumption){
        System.out.println("Average consumption is " + averageConsumption);
    }

    public static void main(String[] args) {
        Treniruotei_1216_1 myCar = new Treniruotei_1216_1();
        myCar.fullThrottle();
        myCar.speed(200);
        myCar.doors(4);
        myCar.consumption(8);
    }
}
