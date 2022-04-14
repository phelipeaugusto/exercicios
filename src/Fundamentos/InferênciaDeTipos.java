package Fundamentos;

public class InferênciaDeTipos {
	public static void main(String[] args) {
		double a = 4.5; //o Double tem que ter um ponto e um numero depois
		System.out.println(a);
		
		a = 12; // caso n tenho o ponto e um numero depois ele adiciona o .0
		System.out.println(a);
		
		var b = 6.5; // o var ele indetificar se é numero ou texto
		System.out.println(b);
		
		b = 10; //Quando é numero não pode ser texto
		System.out.println(b);
		
		var c ="texto"; //Quando é texto não pode ser numero
		System.out.println(c);
		
		c = "novo texto";
		System.out.println(c);
		
		double d; // variavel  declarada
		d = 123.77; //variavel inicialziada
		System.out.println(d); //usada
		// Com o Var não é permitido usar esse metodo
	}
}
