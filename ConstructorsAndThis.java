package com.company;

public class ConstructorsAndThis {
    public static class OOPs {
        int age;
        String name;

        OOPs(){
            //Constructors
        }
        OOPs(int age ,String name){
            //parametrized constructor
            this.age = age;
            this.name = name;

        }

        public void saysHi() {
            System.out.println(name + " [" + age + "] Says Hi");

        }

    }

    public static void swap1(OOPs psn1, OOPs psn2) {
//        person temp = psn1;
//        psn1 = psn2;
//        psn2=temp;

        OOPs p1 = new OOPs();
        p1.age = 10;
        p1.name = "Suryansh";

        OOPs p2 = new OOPs(20,"Sunny");
        p2.saysHi();
    }
}
