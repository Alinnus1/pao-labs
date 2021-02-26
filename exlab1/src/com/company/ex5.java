package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> Pare = new ArrayList<Integer>();
        ArrayList<Integer> Impare = new ArrayList<Integer>();
        int num ;
        Scanner in = new Scanner(System.in);
        System.out.println("Acum vom citi numere pana cand vei introudce la tastatura altceva decat un int");

        while(in.hasNextInt()){
            num = in.nextInt();
            if ( num % 2 ==0 ) Pare.add(num);
            else Impare.add(num);

        }
        System.out.println("Vectorii doriti sunt" + "\n" + Pare.toString() + "\n" + Impare.toString());

    }
}
