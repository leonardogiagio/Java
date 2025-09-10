package Aintroducao.BEstruturaCondicional;

import java.util.Scanner;

public class Exercicio02 {
    //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        if(x % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
