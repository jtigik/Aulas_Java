package br.com.jtigik.class_and_method.desafioModulo;

import javax.swing.JOptionPane;

public class Refeicao {
        public static void main(String[] args) {
                Comida c1 = new Comida("Arroz", 0.180);
                Comida c2 = new Comida("Feijão", 0.300);

                Pessoa p1 = new Pessoa("João", 99.8);

                JOptionPane.showMessageDialog(
                                null,
                                p1.apresentar(),
                                "Jantar",
                                JOptionPane.INFORMATION_MESSAGE);

                p1.comer(c1);

                JOptionPane.showMessageDialog(
                                null,
                                p1.apresentar(),
                                "Jantar",
                                JOptionPane.INFORMATION_MESSAGE);

                p1.comer(c2);

                JOptionPane.showMessageDialog(
                                null,
                                p1.apresentar(),
                                "Jantar",
                                JOptionPane.INFORMATION_MESSAGE);

                p1.comer(c1);

                /*
                 * if (p1.peso <= 100)
                 * JOptionPane.showMessageDialog(null, p1.apresentar(), "Jantar",
                 * JOptionPane.INFORMATION_MESSAGE);
                 * else
                 * JOptionPane.showMessageDialog(null, p1.apresentar(), "Jantar",
                 * JOptionPane.ERROR_MESSAGE);
                 */

        }
}
