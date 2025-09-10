package Aintroducao.AEstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
        do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        Entrada: 5
                6
                7
                8
         Saida: DIFERENCA = -26
         */

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (int) diferencaProduto(A, B, C, D);

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }

    public static double diferencaProduto(int A, int B, int C, int D) {
        return (A * B - C * D);
    }
}
