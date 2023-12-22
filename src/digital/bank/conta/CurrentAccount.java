package digital.bank.conta;

import digital.bank.client.Client;

public class CurrentAccount extends Account{

	public void imprimirExtrato() {
		System.out.println("~~ Extrato Conta Corrente ~~");
		super.imprimirInfosComuns();
	}
}
