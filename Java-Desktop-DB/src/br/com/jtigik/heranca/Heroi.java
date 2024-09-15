package br.com.jtigik.heranca;

public class Heroi extends Jogador {

    /*
    Herança: Compartilha os mesmos atributos
    e comportamentos da Classe Jogador.
     */
    @Override
    boolean atacar(Jogador oponente) {

        /*
        Verificando a distância entre os jogadores.
        método abs() nao diferencia numeros
        positivos dos negativos
         */
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        // Verifica se os jogadores estão lada-a-lado
        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        }
        return false;
    }
}
