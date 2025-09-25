package BorientacaoObjetos.Aintroducao.application;

import BorientacaoObjetos.Aintroducao.entities.Banco;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBanco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String titularConta = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        boolean vaiDepositar = sc.next().equalsIgnoreCase("y");

        double valorDeposito = 0.0;
        if (vaiDepositar) {
            System.out.print("Enter initial deposit value: ");
            valorDeposito = sc.nextDouble();
        }

        Banco banco = new Banco(numConta, titularConta, valorDeposito);

        System.out.println();
        System.out.println("Account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", banco.getNumConta(), banco.getTitularConta(), banco.getSaldo());

        System.out.println("Enter a deposit value: ");
        banco.depositar(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", banco.getNumConta(), banco.getTitularConta(), banco.getSaldo());

        System.out.println("Enter a withdraw value: ");
        banco.sacar(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", banco.getNumConta(), banco.getTitularConta(), banco.getSaldo());

        sc.close();
    }
}
