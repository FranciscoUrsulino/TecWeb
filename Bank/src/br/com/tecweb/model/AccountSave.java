package br.com.tecweb.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class AccountSave extends Account {
	private Double tax;
	
	public AccountSave(Long id, String number, String agency, Double balance, Client client, List transactions, Double tax) {
		super(id,number,agency,balance,client,transactions);
		this.tax = tax;
	}
	
	

	public Double sacar(Double value) {
		return super.sacar(value);
	}

	public Double depositar(Double value) {
		return super.depositar(value);
	}

	public Double transferir(Account account, Double value) {
		return super.transferir(account, value);
		
	}
	
	public List<Transaction> transacoes(){
		return super.transactions;
	}

	@SuppressWarnings("unused")
	private Transaction createTransaction(Account account, Double value, String typeTransaction,
			LocalDateTime localDateTime) {
		
		Transaction transaction = new Transaction();
		transaction.setAccount(account);
		transaction.setValue(value);
		transaction.setTypeTransaction(typeTransaction);
		transaction.setDataTimeTransaction(formatDate(localDateTime.now()));
		
		return transaction;
	}
	
	
	private String formatDate(LocalDateTime date) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dateNow = date.format(formatter);

		return dateNow;
	}

}

