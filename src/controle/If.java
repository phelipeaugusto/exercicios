package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();

		// boolean aprovacao = media <= 10 && media >= 7.0;
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}

		if (media <= 7 && media > 4.5) {
			System.out.println("Recupera��o!");
		}

		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado!");

		}

		if (media >= 11) {
			System.out.println("Ta porra o mlk � um g�nio!");
		}

		entrada.close();

	}
}
