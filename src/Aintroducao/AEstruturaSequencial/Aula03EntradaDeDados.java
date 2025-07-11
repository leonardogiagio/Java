package Aintroducao.AEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Aula03EntradaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String texto;
        int x;
        double d;
        char c;

        System.out.print("Digite um texto: ");
        texto = sc.next();
        System.out.println("texto = " + texto);

        System.out.print("Digite um int: ");
        x = sc.nextInt();
        System.out.println("x = " + x);

        System.out.print("Digite um double: ");
        d = sc.nextDouble();
        System.out.println("d = " + d);

        System.out.print("Digite um char: ");
        c = sc.next().charAt(0);
        System.out.println("c = " + c);

        String s1, s2, s3;
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
