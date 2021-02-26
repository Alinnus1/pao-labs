package com.company;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti va rog un n");
        int n = in.nextInt();
        int s = 0;
        for (int i = 3 ; i <= n;i++){
            if ( i % 3== 0 || i % 5== 0){
                s = s + i;
            }
        }
        System.out.println("Rezultatul dorit este " + s);
    }
}
