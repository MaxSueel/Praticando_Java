import java.util.Scanner;

public class ExercicioCondicional_If_Else01 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não.
		 */

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um numero: ");
		int N = sc.nextInt();

		if (N < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();

	}

}
