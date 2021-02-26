package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        ArrayList<Integer> Note = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Acum vom citi numere pana cand veti introduce -1");
        int n = in.nextInt() ;
        while( n!= -1) {
            Note.add(n);
            n = in.nextInt();
        }
        int s=0;
        for(Integer x : Note){
            s+= x;
        }
        System.out.println("Media notelor primite este:" + s/Note.size());
    }
}
