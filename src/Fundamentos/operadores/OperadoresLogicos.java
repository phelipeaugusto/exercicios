package Fundamentos.operadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		
		System.out.println("---------------");
		//Tabela verdade E (AND)
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		//System.out.println(false && true); // falso e qualquer coisa é falso
		
		System.out.println("---------------");
		//Tabela verdade OU (OR)
		
		//System.out.println(true || true); // true
		//System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); //apenas é falso quando as duas forem falsas 
		
		System.out.println("---------------");
		//Tabela verdade Ou exclusivo (XOR)
		
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); //false, todas iguais são falsas 
		
	}
}
