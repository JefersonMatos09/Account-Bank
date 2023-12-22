package digital.bank.banco;

import digital.bank.conta.Account;
import digital.bank.conta.CurrentAccount;
import digital.bank.conta.SavingsAccount;

public class Main {
 public static void main(String[] args) {
		 
	Account contaCorrente = new CurrentAccount();
	
	Account contaPoupanca = new SavingsAccount();
	
	contaCorrente.depositar(100);
	contaCorrente.transferir(100, contaPoupanca);
	
	contaCorrente.imprimirExtrato();
	contaPoupanca.imprimirExtrato();

	
 	}
}
