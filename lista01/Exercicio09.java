package lista01;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o valor do lado de um quadrado: ");
	
	float lado = sc.nextInt();
	
	double area = (Math.pow (lado,2));
	
	System.out.println("A área do quadrado é igual a: "+area);
	}
}

