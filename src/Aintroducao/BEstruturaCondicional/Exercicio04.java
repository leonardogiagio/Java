package Aintroducao.BEstruturaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    /*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora início: ");
        int horaInicio = sc.nextInt();

        System.out.print("Digite a hora fim: ");
        int horaFim = sc.nextInt();

        int duracao = horaFim - horaInicio;

        if (duracao <= 0) {
            duracao += 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
