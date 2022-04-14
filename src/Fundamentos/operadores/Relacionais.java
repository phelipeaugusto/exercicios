package Fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7); //!= diferente
		
		System.out.println("----------------------");
		
		double nota = 7.4;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean desconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? "  + desconto);
		
		
	}

}
