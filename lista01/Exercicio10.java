package lista01;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da diagonal maior:");
		
		int diagMaior= sc.nextInt();
		
		System.out.println("Digite o valor da diagonal menor:");
		
		int diagMenor = sc.nextInt();
		
		float area = (diagMaior*diagMenor)/2;
		
		System.out.println("A área do losango é igual a: "+area);
	}
}
