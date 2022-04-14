package oo.heranca;

public class Jogador {
	int vida = 100;
	int x = 10;
	int y = 15;

	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltaY == 0 && deltaX == 0) {
			oponente.vida -= 10;
			return true;
		} else {
		return false;
		}
	}

	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LEST:
			x++;
		case SUL:
			y++;
		case OESTE:
			x--;
			break;
		}

		return true;
	}
}
