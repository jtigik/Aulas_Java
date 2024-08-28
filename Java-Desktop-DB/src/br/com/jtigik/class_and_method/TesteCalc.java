package br.com.jtigik.class_and_method;

import javax.swing.JFrame;

public class TesteCalc extends JFrame {
    public TesteCalc() {
        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TesteCalc();
    }
}
