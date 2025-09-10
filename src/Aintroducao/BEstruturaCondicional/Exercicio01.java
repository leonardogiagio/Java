package Aintroducao.BEstruturaCondicional;

import java.util.Scanner;

public class Exercicio01 {
    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        if(x >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
