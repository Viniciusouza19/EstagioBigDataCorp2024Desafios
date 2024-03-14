# Desafios para BigDataCorp 2024

Este repositório contém soluções para uma série de desafios propostos pela BigDataCorp. Todos os códigos estão implementados em Java na pasta `src/main/java/org.example.desafios`.

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
```
[Link Codigo!](estagio_ribeirao_2024/src/main/java/org/example
/desafios)


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
1. Ligue um interruptor e aguarde alguns minutos.
2. Desligue esse interruptor e ligue outro.
3. Entre na sala onde está a lâmpada acesa.
4. O interruptor que foi ligado e desligado e o que está ligado na sala são respectivamente ligados à lâmpada.

## Desafio 5

### Descrição
Escreva um programa que inverta os caracteres de uma string.

### Resposta
O código Java para inverter os caracteres de uma string sem usar funções prontas é o seguinte:

```java
public class ReverseString {
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
```

## Importante

- Para o Desafio 2, o número pode ser informado através de qualquer entrada de preferência ou pode ser previamente definido no código.
- Evite usar funções prontas, como `reverse`, para o Desafio 5.

Fique à vontade para explorar as soluções implementadas neste repositório!
