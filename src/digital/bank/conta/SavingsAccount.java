package digital.bank.conta;

public class SavingsAccount extends Account{

	public void imprimirExtrato() {
	System.out.println("~~ Extrato Conta Corrente ~~");
	super.imprimirInfosComuns();
	
	}
}
