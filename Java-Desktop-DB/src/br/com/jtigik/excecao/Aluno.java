package br.com.jtigik.excecao;

import java.util.Random;

public class Aluno {

    public final String nome;
    public String matricula;
    public double nota;
    public static final int CONT_MAT = 1000; // Contador para gerar matrículas únicas

    // Construtor que recebe o nome como parâmetro e inicializa a matrícula com um
    // valor padrão
    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = "N/A"; // Valor padrão para a matrícula
    }

    // Método para gerar uma matrícula única
    public void gerarMatricula() {
        Random random = new Random();
        this.matricula = "MAT" + random.nextInt(CONT_MAT);
    }

    // Getters para os atributos
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
    }

}
