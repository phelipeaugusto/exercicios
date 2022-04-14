package Fundamentos;

public class ObjetoVsPrimitivo {
	public static void main(String[] args) {
		String s = new String("texto");
		s = s.toUpperCase();
		System.out.println(s);
		
		//wrappers	 são a versão objeto dos tiposprimitivos
		int a = 123;
		System.out.println(a);
	}

}
