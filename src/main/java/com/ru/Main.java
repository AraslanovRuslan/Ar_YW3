package com.ru;

public class Main {
    public static void main(String args[]) {

        byte byte1 = 2;
        byte byte2 = 127;
        System.out.println(byte1 + byte2);


        int a = 20;
        int b = 30;
        int c = 45;
        int d = 55;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (a--));

        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));

        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        double double1 = 100.0;
        double double2 = 40.0;
        System.out.println(double1 / double2);

        float float1 = 1.0f;
        float float2 = 2.2f;
        System.out.println(float1 * float2);

    }
}
