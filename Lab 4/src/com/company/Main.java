package com.company;

public class Main {

    public static void main(String[] args) {
        RandomTask RT = new RandomTask();
        OutTask OT = new OutTask("Bien");
        CounterOutTask COT = new CounterOutTask();
        RT.execute();
        OT.execute();
        COT.execute();

        CounterOutTask COT1 = new CounterOutTask();
        COT.execute();
        System.out.println(":)");
    }
}
