package lista01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número:");
	
	int valor = sc.nextInt();
	int anterior= valor - 1;
	System.out.println("O valor anterior a "+valor+" é "+anterior+".");
			
	}
}
