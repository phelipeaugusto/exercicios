package Fundamentos;

public class ConversaoNumeroEmString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		//da para converter int em stgring desde que eu chame o Integer
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
		
		System.out.println((""+ num1).length());
	}

}
