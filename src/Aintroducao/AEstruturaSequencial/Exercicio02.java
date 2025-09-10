package Aintroducao.AEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
        deste círculo com quatro casas decimais conforme exemplos.

        Fórmula da área: area = π . raio

        Considere o valor de π = 3.14159

        Entrada: 2.00
        Saida: A=12.5664
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;
        double raio;

        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        double area = areaCirculo(raio, PI);

        System.out.println("A = " + area);

        sc.close();
    }

    public static double areaCirculo(double raio, double PI) {
        return PI * Math.pow(raio, 2);
    }
}
