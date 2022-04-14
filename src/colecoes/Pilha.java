package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new  ArrayDeque<String>();
		livros.add("O pequeno princepe");
		livros.push("Don quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); // o ultimo a entrar na fila é o primeiro que sai no console
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.pop()); //remove
	}
}
