package br.com.tecweb.model;

import lombok.Data;

@Data
public class Transaction {

	private Account account;
	private Double value;
	private String typeTransaction;
	private String dataTimeTransaction;
}