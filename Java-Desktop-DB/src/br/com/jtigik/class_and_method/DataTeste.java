package br.com.jtigik.class_and_method;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2023;

        Data d2 = new Data();

        d2.dia = 3;
        d2.mes = 10;
        d2.ano = 2019;

        Data d3 = new Data();

        d3.dia = 14;
        d3.mes = 9;
        d3.ano = 2010;

        System.out.printf("%d.%d.%d\n", d1.dia, d1.mes, d1.ano);

        System.out.print(d2.obterDataFormatada());

        d3.imprimirDataFormatada();
    }
}
