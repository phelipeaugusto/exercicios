package Fundamentos;

public class ConversaoDeTiposPrimitivosNumericos {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		/*
		 o java n�o analisa valor e sim os tipos (int, double, float, byte ...)
		 ent�o tenho que tomar mt cuidado com a convers�o 
		 
		 */
		
		//  float b = 1f; para acrescentar ponto e numeros logo ap�s eu tenho que fazer o seguinte codigo
		float b = (float) 1.1232; // ele tem um limite ap�s o ponto
		System.out.println(b);
		
		//formula para transformar int em byte, lembrando que h� um limite
	
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
	}

}
