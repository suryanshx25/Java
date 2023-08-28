package com.company;

public class OOPsClassesAndObjects{
    public static class person{
        int age;
        String name;
        public void saysHi(){
            System.out.println(name +" [" +age+ "] Says Hi");
        }
    }
    public static void swap1( person psn1 , person psn2){
//        person temp = psn1;
//        psn1 = psn2;
//        psn2=temp;

        psn1 = new person();

        int age = psn1.age;
        psn1.age = psn2.age;
        psn2.age=age;

        psn2 = new person();

        String name = psn1.name;
        psn1.name= psn2.name;
        psn2.name=name;

    }
    public static void main(String[] args) {
        person p1 = new person();
        p1.age = 20;
        p1.name = "A";
     //   p1.saysHi();

        person p2 = new person();
        p2.age = 30;
        p2.name="B";
     //   p2.saysHi();

//        person p3 = p1;
//        p3.age= 40;
//        p3.saysHi();

        p1.saysHi();
        p2.saysHi();
        swap1(p1,p2);
        p1.saysHi();
        p2.saysHi();


    }
}
