package br.com.jtigik.excecao.personalizadaA;

import br.com.jtigik.excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {
        Aluno aluno;
        try {
            aluno = new Aluno("Ana");
            aluno.setNota(7);
            Validar.aluno(aluno);

            Validar.aluno(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaDoIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Chegando ao Fim!");
    }
}
