package Fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.6;
		
	String resultadorParcial = media >= 5.0 ? "recuperação" : "Reprovado";	
	String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadorParcial;
	
	System.out.println(resultadoFinal);
	
	
	double nota = 7.4;
	boolean bomComportamento = true;
	boolean passouPorMedia = nota >= 7;
	
	boolean TemDesconto = bomComportamento && passouPorMedia;
	
	String resultado = TemDesconto ? "sim" :  "não";
	System.out.println("Tem desconto? "  + resultado);
	}
}
