package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] i = {1,2,3};
        String [] s = {"Hello","World"};

        printArray(i);
        printArray(s);
    }
        public static <T> void printArray(T[] t){
            for ( var e : t) {
                System.out.println(e);
            }
        }


}
