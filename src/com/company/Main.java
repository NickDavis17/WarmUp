package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));


    }


    static int close10(int a, int b) {
        int c = Math.abs(10-a);
        int d = Math.abs(10-b);

        if (c == d) {
            int e = 0;
            return e;
        }else if (c < d){
            return a;
        }
            else{
            return b;
        }

    }
}
