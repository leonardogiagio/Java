package Aintroducao.AEstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa, conforme exemplos.
        Entrada:
        10
        30

        Saída:
        SOMA = 40
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int resultado = soma(num1, num2);

        System.out.println("SOMA = " + resultado);

        sc.close();

    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }
}
