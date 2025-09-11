package Aintroducao.CEstruturaRepetitiva;

import java.util.Scanner;

public class ExercicioWhile01 {
    /*
    Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "2002";
        String senhaDigitada = sc.next();

        while(!senha.equals(senhaDigitada)) {
            System.out.println("Senha Invalida");
            senhaDigitada = sc.next();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
