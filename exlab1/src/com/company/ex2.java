package com.company;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti a");
        int a = in.nextInt();
        System.out.println("Introduceti b");
        int b = in.nextInt();
        if (a == b) {
            System.out.println("numerele date sunt egale");
            System.exit(0);
        }
        System.out.println("Numarul mai mare dintre a si b este:");
        if (a > b){
            System.out.println(a);

        }
        else{
            System.out.println(b);
        }
    }
}
