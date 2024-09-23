package br.com.jtigik.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

    /*
     * O conceito de Observer sendo utilizado com Swing é importante
     * pois pode ser implementado com outras GUIs e linguagens.
     * Pode ser aplicado em Swing, JavaFX, Java, JavaScript, etc.
     */
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");

        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // Centralizando na tela.
        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        botao.addActionListener((ActionEvent e) -> {
            System.out.println("Ocorreu um evento!");
        });

        janela.setVisible(true);
    }

}
