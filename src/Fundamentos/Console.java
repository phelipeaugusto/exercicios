package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("bom ");
		System.out.print(" dia");
		
		System.out.println(" bom dia");
		System.out.printf("Megasena: %d %d %d %d %n", 1, 2, 3, 4);
		System.out.printf("Salario: %.1f%n", 1234.567);
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		// %S usa em string  %d em double  %n quebra a linha 
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
