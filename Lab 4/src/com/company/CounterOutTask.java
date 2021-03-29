package com.company;

public class CounterOutTask implements Task {

    private static int contor;
    public CounterOutTask() {
        contor++;
        System.out.println("Constructorul cot a fost apelat");
    }

    @Override
    public void execute() {
        System.out.println("Valoare contorului este " + contor);
    }
}
