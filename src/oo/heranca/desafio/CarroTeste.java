package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Civic();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		System.out.println(c);
		
		Carro c2 = new Ferrari(400);
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		System.out.println(c2);
	}
}
