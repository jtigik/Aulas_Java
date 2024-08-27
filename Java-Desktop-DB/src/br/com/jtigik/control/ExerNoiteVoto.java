package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class ExerNoiteVoto {
    public static void main(String[] args) {
        int idade;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));

        if (idade < 16) {
            JOptionPane.showMessageDialog(null, "Ainda não pode votar!");
        } else {
            if (idade >= 16 && idade < 18) {
                JOptionPane.showMessageDialog(null, "Voto opcional!");
            } else {
                if (idade >= 18 && idade <= 70) {
                    JOptionPane.showMessageDialog(null, "Voto obrigatório!");
                } else {
                    JOptionPane.showMessageDialog(null, "Voto opcional!");
                }
            }
        }
    }// Fim main
}// Fim Class
