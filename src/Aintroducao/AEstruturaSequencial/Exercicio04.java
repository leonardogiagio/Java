package Aintroducao.AEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário,
        com duas casas decimais.

        Entrada:  25
                100
                5.50

         Saída:
         NUMBER = 25
         SALARY = U$ 550.00
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario;
        double horasTrabalhadas, salarioHora, salario;

        System.out.print("Número do Funcionário: ");
        numeroFuncionario = sc.nextInt();

        System.out.print("Horas trabalhadas: ");
        horasTrabalhadas = sc.nextDouble();

        System.out.print("Salário Hora: ");
        salarioHora = sc.nextDouble();

        salario = calculoSalario(horasTrabalhadas, salarioHora);

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);


        sc.close();
    }

    public static double calculoSalario(double horasTrabalhadas, double salarioHora) {
        return horasTrabalhadas * salarioHora;
    }
}
