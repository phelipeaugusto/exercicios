package Fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na Terça (V ou F)
		//Trabalho na Quarta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprarTvde50 = trabalho1 && trabalho2;
		boolean comprarTvde32 = trabalho1 || trabalho2;
		boolean comprarSorvete = trabalho1 ^ trabalho2;
		
		
		System.out.println("Vamos comprar a tv de 50? "+ comprarTvde50); //false
		System.out.println("Vamos comprar a tv de 32? "+ comprarTvde32); //true
		System.out.println("Vamos comprar sorvete? "+ comprarSorvete); //true
		
		System.out.println("Sorvete é mais saúdavel? "+ !comprarSorvete);
		
	}

}
