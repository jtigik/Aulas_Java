package br.com.jtigik.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;

    public Pessoa(String nome, String sobreNome, int idade) {
        setIdade(idade);
        setNome(nome);
        setSobreNome(sobreNome);
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobreNome();
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public final void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    // Getter
    public int getIdade() {
        return idade;
    }

    //Setter
    public final void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);

        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Olá, eu sou " + nome + ", e tenho " + idade + " anos.";
    }

}
