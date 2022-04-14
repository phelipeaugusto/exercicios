package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
public static void main(String[] args) {
	Consumer<Produto> imprimir =
			p -> System.out.println(p.nome  +"!!!!");
			
	Produto p1 = new Produto("Caneta", 3, 0.5);
	imprimir.accept(p1);
	
	Produto p3 =new Produto("carro", 30000, 0.5);
	Produto p4 =new Produto("Moto", 3000, 0.5);
	Produto p5 =new Produto("Bike", 300, 0.5);
	Produto p6 =new Produto("Iphone", 3050, 0.5);
	
	List<Produto> produtos = Arrays.asList(p1, p3, p4, p5, p6); 
	
	produtos.forEach(imprimir);
	produtos.forEach(System.out::println);
	
	}
}
