package controle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite sua nota: ");

			double nota = entrada.nextDouble();
			if (nota > 10 || nota < 0) {
				System.out.println("Nota invalida!");
			} else if (nota >= 8) {
				System.out.println("Você tirou um A!");
			} else if (nota >= 6) {
				System.out.println("Você tirou um B!");
			} else if (nota >= 4) {
				System.out.println("Você tirou um C!");
			} else if (nota >= 2) {
				System.out.println("Você tirou um F!");
			}
		}

	}
}
