package br.com.jtigik.observer;

public class Namorada implements ChegadaAniversiarianteObserver {

    @Override
    public void chegou(ChegadaAniversiarianteEvent event) {
        System.out.println("Apagar as luzes!");
        System.out.println("Fazer silencio!");
        System.out.println("Surpresa!!!");
    }
}
