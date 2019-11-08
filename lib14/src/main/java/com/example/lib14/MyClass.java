package com.example.lib14;

public class MyClass {
    public static void main(String[] argv) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("input triangle Three Size");
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();
        if( a+b>c && a+c>b && b+c>a)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println( "No") ;
        }
    }
}
