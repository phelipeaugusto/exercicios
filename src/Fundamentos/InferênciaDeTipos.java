package Fundamentos;

public class Infer�nciaDeTipos {
	public static void main(String[] args) {
		double a = 4.5; //o Double tem que ter um ponto e um numero depois
		System.out.println(a);
		
		a = 12; // caso n tenho o ponto e um numero depois ele adiciona o .0
		System.out.println(a);
		
		var b = 6.5; // o var ele indetificar se � numero ou texto
		System.out.println(b);
		
		b = 10; //Quando � numero n�o pode ser texto
		System.out.println(b);
		
		var c ="texto"; //Quando � texto n�o pode ser numero
		System.out.println(c);
		
		c = "novo texto";
		System.out.println(c);
		
		double d; // variavel  declarada
		d = 123.77; //variavel inicialziada
		System.out.println(d); //usada
		// Com o Var n�o � permitido usar esse metodo
	}
}
