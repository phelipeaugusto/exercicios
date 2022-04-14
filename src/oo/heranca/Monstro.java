package oo.heranca;

public class Monstro extends Jogador{
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 45;
			return true;
		} else if (deltaY == 0 && deltaX == 0) {
			oponente.vida -= 45;
			return true;
		} else {
		return false;
		}
	}
}
