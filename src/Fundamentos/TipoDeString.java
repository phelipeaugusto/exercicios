	package Fundamentos;
	
	public class TipoDeString {
		public static void main(String[] args) {
			System.out.println("Olá pessoal".charAt(2)); // o charAt é usado para identificar onde que fica tal letra
			
			String s = "boa tarde"; // vc pode substituir o valor original mas não pode modificar o valor original
			s = "bom dia"; // aqui estou substituindo e não modificando o valor original
			s = s.toUpperCase();
			System.out.println(s.concat("!!!!"));	
			System.out.println(s + "!!!!!!!"); /// MSM COISA DA DE CIMA	
			System.out.println(s.startsWith("boa")); // startsWith, só retorna 2 valores, true ou false
			System.out.println(s.startsWith("BOM")); // LEMBRANDO QUE AQUI USEI toUppercase
			System.out.println(s.length()); // tamanho 
			System.out.println(s.endsWith("DIA")); // pergunta se no final termina com o que vc determinar
			System.out.println(s.equalsIgnoreCase("bom dia"));  //ele ignora no ToUpperCase
			
			var nome = "pedro";
			var sobreNome = "augusto";
			var idade = 23;
			var salario = 12321.13;
			
			System.out.printf("O senhor %s %s tem %d anos e ganha R$: %.2f", nome,sobreNome, idade, salario); 
			
			//    \n quebra a linha
			
			String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$: %.2f", nome,sobreNome, idade, salario);
			System.out.println(frase);
		}
	}
