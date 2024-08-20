package br.com.jtigik.control;

import java.util.Random;

public class Aluno {
    private String nome;
    private String matricula;
    private static int CONT_MAT = 1000; // Contador para gerar matrículas únicas

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
}
