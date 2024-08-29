package br.com.jtigik.class_and_method;

public class ContaBancaria {

    String numeroConta;
    double saldo;

    void sacar(double valor) {
        this.saldo -= valor;
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    double obterSaldo() {
        return this.saldo;
    }
}
