package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Filas {
	public static void main(String[] args) {
		Queue<String> filas = new LinkedList<>();
		// Offer e addtem o papel de adicionar na fila
		// a diferen�a � o comportamento quando a fila est� cheia
		filas.add("Ana"); //retorna false se estiver cheia
		filas.offer("Bia"); // lan�a uma  excess��o na fila
		filas.add("Carlos");
		filas.offer("Daniel");
		filas.add("Rafaela");
		filas.offer("Gui");
		
		System.out.println(filas.peek()); //retorna null
		System.out.println(filas.peek());
		System.out.println(filas.element());
		
		// filas.size
		//filas.clear
		//filas.isEmpty
		
		System.out.println(filas.poll());
		System.out.println(filas.remove());
		System.out.println(filas.poll());
		System.out.println(filas.poll());
		System.out.println(filas.poll());
	}
}
