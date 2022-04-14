package lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		Calculo culculo = new Soma();
		System.out.println(culculo.executar(1, 2));
		
		
		Multiplicar multiplcar = new Multiplicar();
		System.out.println(multiplcar.executar(2, 10));
	
		    
	}
}
