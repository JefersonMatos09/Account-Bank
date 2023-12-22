
package digital.bank.banco;

import java.util.List;

import digital.bank.conta.Account;

public class Bank {

	private String nome;
	private List<Account> accounts;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Account> getAccount(){
		return accounts;
	}
	
	public void setContas(List<Account> accounts) {
		this.accounts = accounts;
	}
	
}
