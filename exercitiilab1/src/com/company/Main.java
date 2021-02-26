package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu te rog un n");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Imi trebuie un n pozitiv");
        }
        else{
            for (int i = 0; i<= n; i++){
                if ( i % 2 == 0){
                    System.out.println(i);
                }
            }

        }


    }
}
