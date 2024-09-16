package br.com.jtigik.encapsulamento.casaA;

public class Paulo {

    Ana esposa = new Ana();

    void testeAcesso() {

        // System.out.println(esposa.segredo);
        // Private: Altamente restrito, acesso apenas na Classe
        System.out.println(esposa.facoDentroDeCasa);
        // Default: Segundo nível mais restrito

        System.out.println(esposa.falar);
        //Protected: Default e pode ser herdado

        System.out.println(esposa.todosSabem);
        // Public: Pode ser acessado de quaquer parte do App.
    }
}
