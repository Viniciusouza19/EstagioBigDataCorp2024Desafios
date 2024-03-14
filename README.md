# Desafios para Estagio Target 2024

Este repositório contém soluções para uma série de desafios propostos pela Target. Todos os códigos estão implementados em Java na pasta `src/main/java/org.example.desafios`.

## Desafio 1

### Descrição
Dado o trecho de código abaixo, determine o valor da variável SOMA ao final do processamento.

```java
int INDICE = 13, SOMA = 0, K = 0;
while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}
```

### Resposta
Ao final do processamento, o valor da variável SOMA será 91.

## Desafio 2

### Descrição
Escreva um programa que calcule a sequência de Fibonacci e determine se um número informado pertence ou não à sequência.

### Resposta
O código Java para calcular a sequência de Fibonacci e verificar se um número pertence à sequência é o seguinte:

```java
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
```
[Link para a pasta do desafios](estagio_ribeirao_2024/src/main/java/org/example/desafios/Fibonacci.java)



## Desafio 3

### Descrição
Complete a lógica das seguintes sequências:

a) 1, 3, 5, 7, ___  
b) 2, 4, 8, 16, 32, 64, ____  
c) 0, 1, 4, 9, 16, 25, 36, ____  
d) 4, 16, 36, 64, ____  
e) 1, 1, 2, 3, 5, 8, ____  
f) 2, 10, 12, 16, 17, 18, 19, ____

### Resposta
a) 1, 3, 5, 7, **9**  
b) 2, 4, 8, 16, 32, 64, **128**  
c) 0, 1, 4, 9, 16, 25, 36, **49**  
d) 4, 16, 36, 64, **100**  
e) 1, 1, 2, 3, 5, 8, **13**  
f) 2, 10, 12, 16, 17, 18, 19, **20**

## Desafio 4

### Descrição
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Descubra, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada.

### Resposta
1. Ligue o primeiro interruptor e espere por cerca de 10 minutos.
2. Desligue o primeiro interruptor e ligue o terceiro interruptor.
3. Vá até a sala das lâmpadas.

### Explicacao:
Ao acionar o primeiro interruptor por 10 minutos, a lâmpada irá aquecer. Em seguida, desligo o primeiro interruptor novamente. Depois, ligo o terceiro interruptor. Então, vou até uma sala. Se a lâmpada estiver apagada e fria, sei que o segundo interruptor é o responsável por ela. Em seguida, dirijo-me à segunda sala. Se a lâmpada estiver quente e acesa, sei que o primeiro interruptor está ligado, enquanto o terceiro é o que acabei de ligar.

## Desafio 5

### Descrição
Escreva um programa que inverta os caracteres de uma string.

### Resposta
O código Java para inverter os caracteres de uma string sem usar funções prontas é o seguinte:

```java
public class ReverseString {
     public static void main(String[] args) {

        // Padrao no braco
        String str = "Target";
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
```
[Link para a pasta do desafios](estagio_ribeirao_2024/src/main/java/org/example/desafios/StringRevert.java)

## Importante

- Para o Desafio 2, o número pode ser informado através de qualquer entrada de preferência ou pode ser previamente definido no código.
- Evite usar funções prontas, como `reverse`, para o Desafio 5.
