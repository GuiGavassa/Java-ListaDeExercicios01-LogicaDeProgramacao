package lista01;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o número do Raio:");
		int raio = sc.nextInt();
		
		double area = Math.PI*(Math.pow(raio, 2));
		
		System.out.println("A área do círculo é de: "+area);
	}

}
