package br.com.jtigik.class_and_method;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterDataFormatada() {
        return String.format("%d.%d.%d\n", dia, mes, ano);
    }

    void imprimirDataFormatada() {

        System.out.printf(obterDataFormatada());

        System.out.printf("%d.%d.%d\n", dia, mes, ano);
    }
}
