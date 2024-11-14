import java.util.Scanner;

public class ExercicioFundamentos01 {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */

		Scanner sc = new Scanner(System.in);

		int A, B, soma;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();

		soma = A + B;

		System.out.println("O valor da SOMA  = " + soma);

		sc.close();

	}

}
