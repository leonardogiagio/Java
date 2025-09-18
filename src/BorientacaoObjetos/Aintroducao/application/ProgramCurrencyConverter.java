package BorientacaoObjetos.Aintroducao.application;

import BorientacaoObjetos.Aintroducao.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCurrencyConverter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarAmount = sc.nextDouble();

        double amountInReais = CurrencyConverter.paidInReais(dollarPrice, dollarAmount);

        System.out.printf("Amount to be paid in reais = %.2f", amountInReais);

        sc.close();
    }
}
