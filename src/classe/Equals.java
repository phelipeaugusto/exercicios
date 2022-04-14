package classe;

public class Equals {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		Usuarios u1 = new Usuarios();
		u1.nome = "Phelipe";
		u1.email = "phelipeaugusto32@gmail.com";

		Usuarios u2 = new Usuarios();
		u2.nome = "Phelipe";
		u2.email = "phelipeaugusto32@gmail.com";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));

		System.out.println(u2.equals(new Data()));
	}

}
