package com.company;

public class OutTask  implements Task {

    private String mesaj;
    public OutTask(String mesaj) {
        this.mesaj = mesaj;
        System.out.println("Constructorul ot a fost apelat");
    }

    @Override
    public void execute() {
        System.out.println(mesaj);
    }
}
