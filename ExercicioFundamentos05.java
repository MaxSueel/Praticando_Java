import java.util.Locale;
import java.util.Scanner;

public class ExercicioFundamentos05 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
		double preco1, preco2, total;
		
		System.out.println("Digite o codigo 1: ");
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade: ");
		qte1 = sc.nextInt();
		System.out.println("Digite o preco: ");
		preco1 = sc.nextDouble();
		
		System.out.println("Digite o codigo 2");
		cod2 = sc.nextInt();
		System.out.println("Digite a segunda quantidade: ");
		qte2 = sc.nextInt();
		System.out.println("Digite o preco: ");
		preco2 = sc.nextDouble();

		total = preco1 * qte1 + preco2 * qte2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();

	}

}