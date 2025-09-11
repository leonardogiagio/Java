package Aintroducao.CEstruturaRepetitiva;

import java.util.Scanner;

public class ExercicioWhile02 {
    /*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
                ===Menu===\s
                1. Álcool
                2. Gasolina
                3. Diesel
                4. Fim""";

        System.out.println(menu);
        int opcao = 0;
        int somaAlcool = 0;
        int somaGasolina = 0;
        int somaDiesel = 0;

        while(opcao != 4) {
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    somaAlcool++;
                    break;
                case 2:
                    somaGasolina++;
                    break;
                case 3:
                    somaDiesel++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Digite um código válido!");
            }

            System.out.println(menu);
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + somaAlcool);
        System.out.println("Gasolina: " + somaGasolina);
        System.out.println("Diesel: " + somaDiesel);

        sc.close();
    }
}
