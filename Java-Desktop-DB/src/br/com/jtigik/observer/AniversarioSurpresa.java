package br.com.jtigik.observer;

public class AniversarioSurpresa {

    public static void main(String[] args) {
        // Instanciando os atores
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        // Registrando a namorada (Simulando ela interfonando ao Porteiro)
        porteiro.addChegadaAniversiarianteObserver(namorada);

        //Iniciar o monitoramento
        porteiro.start();

    }
}
