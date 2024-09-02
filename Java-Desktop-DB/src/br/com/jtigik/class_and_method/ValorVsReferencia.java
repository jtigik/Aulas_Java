package br.com.jtigik.class_and_method;

import javax.swing.JOptionPane;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // Atribuição por valor (Tipo: Primitivo)

        a++;
        b--;
        JOptionPane.showMessageDialog(
                null,
                "D1: " + a + " - D2: " + b,
                "Atribuição por valor",
                JOptionPane.INFORMATION_MESSAGE);

        Data d1 = new Data(1, 1, 1970);
        Data d2 = d1; // Atribuição por referência (Tipo: Objeto).

        d1.dia = 31;
        d2.mes = 12;

        d1.ano = 2022;

        JOptionPane.showMessageDialog(
                null,
                d1.obterDataFormatada(),
                "Atribuição por referência - D1",
                JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(
                null,
                d2.obterDataFormatada(),
                "Atribuição por referência - D2",
                JOptionPane.INFORMATION_MESSAGE);

        int c = 5;
        alterarPrimitivo(c);
        JOptionPane.showMessageDialog(
                null,
                String.format("Valor de C: %d", c),
                "Alterar Primitivo",
                JOptionPane.INFORMATION_MESSAGE);
    }

    static void voltaDataParaValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int c) {
        c++;
    }
}
