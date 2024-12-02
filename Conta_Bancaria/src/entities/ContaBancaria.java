package entities;

public class ContaBancaria {

	int numero;
	Pessoa titular;
	
	
	double saldo;
	int agencia;

	void deposita(double valorASerDepositado) { // Aqui criamos um comportamento "deposita"
		this.saldo += valorASerDepositado - 0.1; // AQui alteramos a regra de negocio, quando feito isso altera o valor
													// das variaveis

	}

	void saca(double valorASerSacado) {// o metodo void não recebe valor
		if (this.saldo >= valorASerSacado) {
			this.saldo -= valorASerSacado;

		}

	}
	
	void transfere(double valor, ContaBancaria destino) {
		this.saldo -= valor;
		destino.saldo += valor;
	}
	
	

}
