package org.example.desafios;
public class Desafio1 {
    public static void main(String[] args) {
        //Padrao no braco
        int indice = 13;
        int soma = 0;

        for (int key = 1; key <= indice; key++) {
            soma += key;
        }

        System.out.println(soma);

        //Simplificado kk
        int somaSimple = (indice * (indice + 1)) / 2;
        System.out.println(somaSimple);
    }
}