package com.company;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti va rog n");
        int n = in.nextInt();
        int f =1;
        for(int i = 1; i<=n ; i++) f = f * i;
        System.out.println("Factorialul numarului introdus este " + f);
    }
}
