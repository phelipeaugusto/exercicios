package Fundamentos;

public class ConversaoDeTiposPrimitivosNumericos {
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a);
		/*
		 o java não analisa valor e sim os tipos (int, double, float, byte ...)
		 então tenho que tomar mt cuidado com a conversão 
		 
		 */
		
		//  float b = 1f; para acrescentar ponto e numeros logo após eu tenho que fazer o seguinte codigo
		float b = (float) 1.1232; // ele tem um limite após o ponto
		System.out.println(b);
		
		//formula para transformar int em byte, lembrando que há um limite
	
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
	}

}
