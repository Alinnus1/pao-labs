package com.company;

public class RandomTask  implements Task {

    private double numar;
    public RandomTask() {
        numar = Math.random();
        System.out.println("Constructorul rt a fost apelat");
    }

    @Override
    public void execute() {
        System.out.println("Acesta este numarul random" + numar);
    }
}
