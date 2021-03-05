package com.company;

import java.util.Locale;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        // exercitiul 1
	    Person p1 = new Person("poi" , "toi", 40, 1234,"teacher");
        System.out.println(p1.toString());
        p1.setAge(23);
        System.out.println(p1);

        Person p2 = new Person("hei", "lol", 2,23,"copil");
        System.out.println(p2);

        //exercitiul 2
        Room r1 = new Room(2,3,"Amfiteatru");
        Room r2 = new Room(5,1,"Lab");

        System.out.println(r1);
        System.out.println(r2);

        //exercitiul 3

        Subject Mate = new Subject(r1,3,p1);
        Subject Poo  = new Subject(r2,10,p2);

        System.out.println(Mate);
        System.out.println(Poo);

        //exercitiul 4

        Singleton x = Singleton.Singleton();
        Singleton y = Singleton.Singleton();

        x.s = (x.s).toUpperCase();
        System.out.println(x.s + '\n' + y.s);
    }
}


