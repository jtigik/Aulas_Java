package br.com.jtigik.control;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        /*
         * Deverá calcular a média das notas de uma Turma.
         *
         * Não se sabe qual é numero de alunos de cada Turma.
         *
         * O user deve inserir nota válida entre 0.0 e 10.0
         *
         * Crie uma variável 'total' para aramazenar a soma de
         * todas notas informadas.
         *
         * Crie uma variável para computar quantas notas
         * válidas foram informadas pelo usuário.
         *
         * O programa encerra quando o usuário digitar '-1'
         *
         * Utilize uma menssagem para mostrar ao usuário qual são os valores aceitáveis.
         */

        Scanner entrada = new Scanner(System.in);

        int qtdNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1) {
            System.out.print("Informe a nota (ou -1 p/ sair): ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;
                qtdNotas++;
            } else if (nota != -1) {
                System.out.println("Nota inválida!");
            }
        }

        double media = total / qtdNotas;
        System.out.println("Média = " + media);

        entrada.close();

    }
}
