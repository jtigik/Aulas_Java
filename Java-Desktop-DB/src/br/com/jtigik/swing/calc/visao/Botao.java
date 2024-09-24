package br.com.jtigik.swing.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {

    public Botao(String texto, Color cor) {
        setText(texto);
        setOpaque(true);
        setBackground(cor);

        setForeground(Color.WHITE);

        setFont(new Font("consolas", Font.PLAIN, 25));

        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

}
