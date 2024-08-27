package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class NoiteEnquanto {
    public static void main(String[] args) {
        // Declaração das variáveis
        float nota, soma = 0f, media;
        int cont = 1;

        // Processando o loop e imprimindo na tela
        while (cont <= 8) {
            nota = Float.parseFloat(
                    JOptionPane.showInputDialog(String.format("Informe a nota %d: ", cont)));

            // Adição das notas informadas e incremento da variável de controle
            soma += nota;
            cont++;

        } // Fim do while
          // Calculando a média e imprimindo na tela.
        media = soma / cont;
        JOptionPane.showMessageDialog(null, String.format("A média é: %.1f", media));
    }
}
