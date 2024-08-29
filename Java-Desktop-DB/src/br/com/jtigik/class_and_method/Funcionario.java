package br.com.jtigik.class_and_method;

public class Funcionario {
    public double valorHora;
    public double cargaHoraria;

    public void dobrarValorHora() {
        // this.valorHora *= 2;
        this.valorHora = this.valorHora * 2;
    }

    public double clacularSalario() {
        return this.valorHora * this.cargaHoraria;
    }

    public void aumentarCargaHoraria(double horas) {
        // this.cargaHoraria += horas;
        this.cargaHoraria = this.cargaHoraria + horas;
    }

}
