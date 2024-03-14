package org.example.desafios;

public class Fibonacci {
    public static void main(String[] args) {
        int fiboRange = 15;
        System.out.print("Sequência de Fibonacci até o " + fiboRange + "º termo: ");
        for (int i = 0, a = 0, b = 1; i < fiboRange; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        int numero = 13;
        if (verificarFibonacci(numero)) {
            System.out.println("\nO número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }
    
    public static boolean verificarFibonacci(int n) {
        for (int a = 0, b = 1; a <= n; ) {
            if (a == n) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}
