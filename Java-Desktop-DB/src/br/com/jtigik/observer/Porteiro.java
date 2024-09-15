package br.com.jtigik.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro extends Thread {

    //Lista para armazenar todos os observers.
    private List<ChegadaAniversiarianteObserver> observers = new ArrayList<>();

    public void addChegadaAniversiarianteObserver(ChegadaAniversiarianteObserver observer) {
        this.observers.add(observer);
    }

    // Responsável por detectar o evento e avisar todos os interessados.
    @Override
    public void run() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner entrada = new Scanner(System.in);

        int valor;
        do {
            valor = entrada.nextInt();
            if (valor == 1) {
                ChegadaAniversiarianteEvent event = new ChegadaAniversiarianteEvent(new Date());
                // Notificar os observers
                for (ChegadaAniversiarianteObserver observer : observers) {
                    observer.chegou(event);
                }
            } else {
                System.out.println("Alarme falso!");
            }
        } while (valor != 1);
    }

}
