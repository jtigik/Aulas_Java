package br.com.jtigik.control;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean aprovado;

        System.out.print("Informe a média: ");
        double media = sc.nextDouble();

        aprovado = media >= 7.0 && media <= 10;

        if (aprovado) {
            System.out.println("Aprovado!");
            System.out.println("Parabéns!");
        }

        aprovado = media < 7 && media >= 4.5;
        if (aprovado)
            System.out.println("Recuperação");

        aprovado = media < 4.5 && media >= 0;
        if (aprovado) {
            System.out.println("Recuperação");
        }

        sc.close();
    }
}
