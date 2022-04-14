package Fundamentos.operadores;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		var x = 23.32;
		double y = 2.2;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		System.out.println("------");
		
		int a = 8;
		int b = 7;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a /  (double) b); // podemos usar o cast para converter em um double
		
	}

}
