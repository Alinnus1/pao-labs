package com.company;

public class Singleton {

    private static Singleton single_instance = null;

    public String s;

    private Singleton() {
        s = "Hei";
    }
    public static Singleton Singleton(){
        if(single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
