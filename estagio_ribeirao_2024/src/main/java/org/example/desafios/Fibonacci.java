package org.example.desafios;

public class Fibonacci {
    public static void main(String[] args) {
        int fiboRange = 15;
        int a = 0, b = 1;
        for (int i = 0; i < fiboRange; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}