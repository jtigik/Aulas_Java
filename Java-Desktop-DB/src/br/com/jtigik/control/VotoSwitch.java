package br.com.jtigik.control;

import javax.swing.JOptionPane;

public class VotoSwitch {

    public enum VotoEnum {
        NAO_PODE_VOTAR(1, "Ainda não pode votar!"),
        PODE_VOTAR(2, "Pode votar!"),
        DEVE_VOTAR(3, "Deve votar!");

        private final int codigo;
        private final String situacao;

        private VotoEnum(int codigo, String situacao) {
            this.codigo = codigo;
            this.situacao = situacao;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getSituacao() {
            return situacao;
        }

        public static VotoEnum obterSituacao(int codigo) {
            for (VotoEnum dado : VotoEnum.values()) {
                if (dado.getCodigo() == codigo) {
                    return dado;
                }
            }
            return null;
        }

    }

    public static void main(String[] args) {
        int idade = Integer.parseInt(
                JOptionPane.showInputDialog("Informe a idade: "));

        JOptionPane.showMessageDialog(
                null, String.format(
                        "Resultado final: %s",
                        VotoEnum.obterSituacao(idade).getSituacao()));
    }
}
