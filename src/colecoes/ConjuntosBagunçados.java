package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosBagun�ados {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);//  boolean -> Boolean
		conjunto.add("teste"); //String
		conjunto.add(1); //int -> Integer 
		conjunto.add('x'); //
		
		System.out.println("tamanho � " + conjunto.size());
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.contains('x'));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		
		conjunto.addAll(nums); //para juntar os 2
		//conjunto.retainAll(nums);
		System.out.println(conjunto);
		
	}
}
