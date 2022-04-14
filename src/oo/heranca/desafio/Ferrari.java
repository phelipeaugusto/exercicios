package oo.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		this(350);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 35;
	}
	
//void acelerar() {
//	
//	super.acelerar();
//	velocidadeAtual +=100;
//	
//	}
}
