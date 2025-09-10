package Aintroducao.BEstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {
    /*
    Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código e a quantidade desejada: ");
        int codigo = sc.nextInt();
        int qtd = sc.nextInt();

        double valor = 0;
        double total = 0;

        if(codigo == 1) {
            valor = 4.0;
        } else if(codigo == 2) {
            valor = 4.5;
        } else if(codigo == 3) {
            valor = 5.0;
        } else if(codigo == 4) {
            valor = 2.0;
        } else {
            valor = 1.50;
        }

        total = valor * qtd;

        System.out.println("Total: R$ " + total);

        sc.close();
    }
}
