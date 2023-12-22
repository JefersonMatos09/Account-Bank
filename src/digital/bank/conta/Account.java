package digital.bank.conta;

public class Account implements IAccount {
	
	private static final int AGENCY_STANDARD = 1;
	private static int SEQUENTIAL = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	
	


	public Account() {
		this.agency = Account.AGENCY_STANDARD;
		this.number = SEQUENTIAL++; 
		
	}
	
	public void sacar(double valor) {
balance = balance -= valor; //esse pode ser um exemplo a ser usado.
	}

	public void depositar(double valor) {
	balance = balance += valor; //esse seria outro exemplo para usar na soma ou subtração
	}

	public void transferir(double valor, Account contaDestino) {
	this.sacar(valor);
	contaDestino.depositar(valor);
	}

	
	public int getAgency() {
		return agency;
	}
	
	public int getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	protected void imprimirInfosComuns() {
		
		System.out.println(String.format("Agencia: %d ",this.agency));
		System.out.println(String.format("Número: %d ",this.number));
		System.out.println(String.format("Saldo: %.2f ",this.balance));
	}
@Override
	public void depositar(Double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(Double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(Double valor, Account contaDestino) {
		// TODO Auto-generated method stub
		
	}

	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirExtrato(String cliente) {
		// TODO Auto-generated method stub
		
	}

}
	



