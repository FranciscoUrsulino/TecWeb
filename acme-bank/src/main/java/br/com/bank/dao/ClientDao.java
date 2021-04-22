package br.com.bank.dao;

import java.util.List;

import br.com.bank.model.Client;

public interface ClientDao {

	public Client getClient(String name);

	public List<Client> getAll();

	public void save(Client client);

	public void deleteById(Long idClient);
}
