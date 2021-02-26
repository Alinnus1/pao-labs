package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introuceti indexul n: \n P.S. numerotarea incepe de la 0");
        int n = in.nextInt();
        ArrayList<Integer> Fibo = new ArrayList<Integer>();
        Fibo.add(0);
        Fibo.add(1);
        for ( int i = 2; i <=n ; i++){
            Fibo.add(Fibo.get(i-1) + Fibo.get(i-2));
        }
        System.out.println("Termenul de la indexul n din sirul lui Fibonacci este: " + Fibo.get(n) );


    }
}
