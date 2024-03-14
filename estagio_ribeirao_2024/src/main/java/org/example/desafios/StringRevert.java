package org.example.desafios;

public class StringRevert {
    public static void main(String[] args) {

        // Padrao no braco
        String str = "BigDataCorp"; // Hehe
        StringBuilder strReverted = new StringBuilder();

        for (int i = str.length(); i > 0; i--) {
            strReverted.append(str.split("")[i - 1]);
        }

        System.out.println(str + ": " + strReverted);

        //Simplificado
        StringBuilder strRevertedSimple = new StringBuilder(str).reverse();
        System.out.println(str + ": " + strRevertedSimple);

    }

}