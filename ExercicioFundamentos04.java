import java.util.Locale;
import java.util.Scanner;

public class ExercicioFundamentos04 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double valorHora, salario;
		
		System.out.println("Digite o numero: ");
		numero = sc.nextInt();
		System.out.println("Digite a hora: ");
		horas = sc.nextInt();
		System.out.println("Digite o valor da hora trabalhada: ");
		valorHora = sc.nextDouble();

		
		salario = valorHora * horas;

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
