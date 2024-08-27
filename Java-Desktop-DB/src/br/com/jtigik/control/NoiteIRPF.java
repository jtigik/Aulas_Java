package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class NoiteIRPF {
    public static void main(String[] args) {
        float salario, taxa, irpf;
        taxa = 0f;

        salario = Float.parseFloat(
                JOptionPane.showInputDialog("Informe o salário: "));

        if (salario > 4664.60) {
            taxa = 0.275f;
            irpf = salario * taxa;
            taxa *= 100f;
            // taxa= taxa * 100f;
            JOptionPane.showMessageDialog(null,
                    "Com o salário de R$ " + salario + "\nA taxa é de: R$" + taxa + "\nDedução de R$ : " + irpf);

        } else {
            if (salario > 3751.05) {
                taxa = 0.225f;
                irpf = salario * taxa;
                taxa *= 100f;

                JOptionPane.showMessageDialog(null,
                        "Com o salário de R$ " + salario + "\nA taxa é de: R$" + taxa + "\nDedução de : " + irpf);
            } else {
                if (salario > 1903.98) {
                    taxa = 0.150f;
                    irpf = salario * taxa;
                    taxa *= 100f;

                    JOptionPane.showMessageDialog(null,
                            "Com o salário de R$ " + salario + "\nA taxa é de: R$" + taxa + "\nDedução de : " + irpf);
                } else {

                    JOptionPane.showMessageDialog(null,
                            "Com o salário de R$ " + salario + "\nA taxa é de: R$" + taxa
                                    + "\nExiste isenção do IRPF!");
                }

            }
        }
    }// Fim main()
}// Fim Class
