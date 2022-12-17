package lista01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int valor1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int valor2 = sc.nextInt();
		
		int multiplicacao = valor1*valor2;
		
		System.out.println("O valor da multilicação entre "+valor1+" e "+valor2+" é "+multiplicacao);
	}
}
