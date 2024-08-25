package br.com.jtigik.class_and_method;

import javax.swing.JOptionPane;

public class TesteEncapsulamento {
    public static void main(String[] args) {

        PessoaTeste p1 = new PessoaTeste();

        p1.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        p1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: ")));
        p1.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Informe o peso: ")));

        JOptionPane.showMessageDialog(null, p1);

    }
}
