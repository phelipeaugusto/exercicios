package Fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia, X!";
		s = s.replace("X", "Luzia"); // Ele faz a substituição do que está escrito, 
		s = s.toUpperCase(); //ToUpperCase deixa as letras maiúsculas 
		s = s.concat("!!!!"); /// ele vai concatenar (juntar) o que for escrito.
		System.out.println(s);
		
		//String concatena com String
		String x = "leo".toUpperCase();
		System.out.println(x);
		String y = "Bom dia, X!"
				.replace("X", "phelipe")
				.toUpperCase()
				.concat(" Namorado da luzia");
		System.out.println(y);
		
		//tipos primitivos não tem "."

	}

}
