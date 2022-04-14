package arrays;

import java.util.Arrays;
//import java.util.Iterator;

public class Exercicios {
	public static void main(String[] args) {
		double[] notasDosAlunosA = new double[4];
		notasDosAlunosA[0] = 9.3;
		notasDosAlunosA[1] = 8;
		notasDosAlunosA[2] = 6.3;
		notasDosAlunosA[3] = 3.3;
		
		
		System.out.println(Arrays.toString(notasDosAlunosA));
		
		double totalAlunoA = 0;
		for(int  i = 0;i < notasDosAlunosA.length; i++ ) {
			totalAlunoA += notasDosAlunosA[i];
		}
		System.out.println(totalAlunoA / notasDosAlunosA.length);
		
		double[] notasAlunoB = {9.9, 7.6, 4.5, 10};
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];	
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
