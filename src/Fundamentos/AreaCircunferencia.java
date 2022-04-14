package Fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
			//(°F - 32) x 5/9  = °C
			// a palavra final é uma palavra reservada que não da para alterar o valor
		final double FATOR = 5.0/9.0;
		final double ajuste = 32;
		
		double fahrenheit  = 86;
		double celsius = (fahrenheit  - ajuste) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
		
		
		fahrenheit  = 100;
		celsius = (fahrenheit  - ajuste) * FATOR;
		System.out.println("O resultado é " + celsius + "°C.");
	}
}


