package br.com.jtigik.heranca;

public class Jogador {

    int vida = 100;
    int x;
    int y;

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
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        }
        return false;
    }

    boolean andar(Direcao direcao) {

        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }
        return true;
    }
}
