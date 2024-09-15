package br.com.jtigik.observer;

import java.util.Date;

public class ChegadaAniversiarianteEvent {

    //Classe carrega os dados do evento
    // Monitora cliques do mouse e do teclado
    private final Date horaDaChegada;

    public ChegadaAniversiarianteEvent(Date horaDaChegada) {
        super(); //Invoca a superClasse
        this.horaDaChegada = horaDaChegada;
    }

    public Date getHoraDaChegada() {
        return horaDaChegada;
    }

}
