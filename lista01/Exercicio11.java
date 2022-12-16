package lista01;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da Base Maior:");
		
		int baseMaior = sc.nextInt();
		
		System.out.println("Digite o valor da Base Menor:");
		
		int baseMenor = sc.nextInt();
		
		System.out.println("Digite o valor da Altura do Trapézio:");
		
		int altura = sc.nextInt();
		
		float area = (baseMaior+baseMenor)*altura/2;
		
		System.out.println("A área do trapézio é igual a: "+area);
		
	}

}
