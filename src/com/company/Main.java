package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");

        if (a == x && y + y == a) {
            System.out.println("a == x && y + y == a");

        }

        //  && - AND - Both conditions have to be true to return true
        //  || - OR - Only one condition has to be met to be true
        //  ! - NOT -
        //  == - Equal too - Validates condition

        if (y + y == a || a == x) {
            System.out.println("y + y == || a == x");
            if(a < b){
                System.out.println("a < b");
            }
        }

    }
}