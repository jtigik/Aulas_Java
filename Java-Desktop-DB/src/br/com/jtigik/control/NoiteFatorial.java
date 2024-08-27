package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class NoiteFatorial {
    public static void main(String[] args) {
        int numero, cont = 1, fatorial = 1;

        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número inteiro maior do que zero: "));

        if (numero > 0) {
            // Calcular Fatorial com while
            while (cont <= numero) {
                fatorial *= cont;
                cont++;
            } // Fim while
            JOptionPane.showMessageDialog(null,
                    String.format("O Fatorial de %d é igual a: %d", numero, fatorial));
        } else {
            JOptionPane.showMessageDialog(null, "O número digitado deve ser maior que ZERO!");
        }
    }
}
