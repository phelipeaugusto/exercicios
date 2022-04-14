package controle;

public class Switch01 {
	public static void main(String[] args) {
//		 if(boolean) ...
//		 while(boolean) ...
//		 for(;boolean;) ...

		String faixa = "PRETA";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Nassai-Dai");
			
		case "marrom":
			System.out.println("Sei o Tekki Shodan ");
			
		case "roxa":
			System.out.println("Sei o Heian Godan");
			
		case "verde":
			System.out.println("Sei o Heian Yodan");
			
		case "laranja":
			System.out.println("Sei o Heian Sandan");
			
		case "vermelha":
			System.out.println("Sei o Heian Niidan");
			
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
			
		default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim!");
		
		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe rirar");
		}
	}
}
