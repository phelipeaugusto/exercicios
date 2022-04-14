package colecoes;

//import java.util.HashSet;
//import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<>();
	
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		listaAprovados.add("Phelipe");
		listaAprovados.add("João");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
	}
}
