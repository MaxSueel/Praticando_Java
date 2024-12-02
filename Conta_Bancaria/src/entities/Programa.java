package entities;

import java.util.Locale;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		ContaBancaria maxsueel = new ContaBancaria();
		maxsueel.numero = 1205;									// Aqui adicionamos atributos ".atributo"
		maxsueel.agencia = 4242;
		maxsueel.saldo = 600;
		
		
		
		maxsueel.titular = new Pessoa();
		maxsueel.titular.nome = "Max Sueel Gomes da Silva";
		maxsueel.titular.cpf = "123456789";
		maxsueel.titular.dataDeNacimento = "12/05/1987" ;
		
		
		maxsueel.deposita(100);
				
		maxsueel.saca(5000.0);
		
		ContaBancaria eduarda = new ContaBancaria();
		eduarda.numero = 546;
		eduarda.saldo = 1200;
		eduarda.deposita(100);
		
		
		eduarda.saca(100);
		maxsueel.deposita(200);
		
		eduarda.transfere(300, maxsueel);
		
		System.out.println(" Max saldo: " + maxsueel.saldo);
		System.out.printf("Eduarda saldo: %.2f%n ", + eduarda.saldo);
		System.out.println(maxsueel.titular.dataDeNacimento);
		

	}

}