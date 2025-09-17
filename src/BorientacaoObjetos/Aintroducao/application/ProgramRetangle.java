package BorientacaoObjetos.Aintroducao.application;

import BorientacaoObjetos.Aintroducao.entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Retangle retangle = new Retangle();

        System.out.println("Enter rectangle width and height: ");

        double width =  sc.nextDouble();
        double height = sc.nextDouble();

        retangle.width = width;
        retangle.height = height;

        System.out.printf("AREA = %.2f%n", retangle.area());
        System.out.printf("PERIMETER = %.2f%n",  retangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n",  retangle.diagonal());

        sc.close();
    }
}
