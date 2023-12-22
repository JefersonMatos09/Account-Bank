package digital.bank.conta;

public interface IAccount {
	

	void sacar(Double valor);
	
	 void depositar(Double valor);
	
	 void transferir(Double valor, Account contaDestino);
	 
	 static void imprimirExtrato() {
	 }

	void imprimirExtrato(String cliente);
	
}
