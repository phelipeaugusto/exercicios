package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();

		// boolean aprovacao = media <= 10 && media >= 7.0;
		if (media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}

		if (media <= 7 && media > 4.5) {
			System.out.println("Recuperação!");
		}

		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado!");

		}

		if (media >= 11) {
			System.out.println("Ta porra o mlk é um gênio!");
		}

		entrada.close();

	}
}
