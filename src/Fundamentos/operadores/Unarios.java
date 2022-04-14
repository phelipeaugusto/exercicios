package Fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a++; //acrescenta +1
		a--; //diminui -1
		
		++b;
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
