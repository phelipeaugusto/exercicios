package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador h1 = new Heroi();
		h1.x = 10;
		h1.y = 10;
		
		Jogador m1 = new Monstro();
		m1.x = 10;
		m1.y = 11;
		
		
		System.out.println("O heroi tem = " + h1.vida);
		System.out.println("O Monstro tem = " +m1.vida);
		
		h1.atacar(m1);
		m1.atacar(h1);
		
		System.out.println("O heroi tem = " + h1.vida);
		System.out.println("O Monstro tem = " +m1.vida);
	}
}
