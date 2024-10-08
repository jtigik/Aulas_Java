package br.com.jtigik.class_and_method;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data(int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format("%d.%d.%d\n", dia, mes, ano);
    }

    void imprimirDataFormatada() {

        System.out.printf(obterDataFormatada());
    }
}
