package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
	 UnaryOperator<Integer> maisDois = n -> n + 2;
	 UnaryOperator<Integer> vezesDois = n -> n * 2;
	 UnaryOperator<Integer> aoQuadradoDois = n -> n * n;
	 
	 int resultado1 = maisDois.
			 andThen(vezesDois).
			 andThen(aoQuadradoDois).
			 apply(0); 
	 System.out.println(resultado1);
	 
	 System.out.println("------");
	 
	 int resultado2 = aoQuadradoDois
			 .compose(vezesDois)
			 .compose(maisDois)
			 .apply(0);
	 System.out.println(resultado2);
	}
}
