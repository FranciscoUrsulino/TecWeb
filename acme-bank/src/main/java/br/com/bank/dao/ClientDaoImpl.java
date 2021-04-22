/**
 * 
 */
package br.com.bank.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;

import br.com.bank.model.Client;
import br.com.bank.util.JPAUtil;

/**
 * @author cbgomes
 *
 */
public class ClientDaoImpl implements ClientDao {

	@Override
	public Client getClient(String name) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
			
		try {
			
			Client client = entityManager.createNamedQuery("Client.getByName",Client.class)
					.setParameter("name", name)
					.getSingleResult();
			
			return client;
			
		}catch (NoResultException e) {
			e.getMessage();
			entityManager.close();
		}
		
		entityManager.close();
		
		return null;
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
					
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		List<Client> clientes = null;
		
		try {
			
		TypedQuery<Client> 
		consulta = entityManager.createQuery("SELECT * FROM clients", Client.class);

		clientes = consulta.getResultList();
		
		} catch (NoResultException e) {
			e.getMessage();
			entityManager.close();
		}
		
		entityManager.close();
		
		return clientes;
	}

	@Override
	public void save(Client client) {
		
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		try {
			
			entityManager.persist(client);
			entityManager.getTransaction().commit();
			entityManager.close();
			//aqui
			
	
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}

	@Override
	public void deleteById(Long idClient) {
		// TODO Auto-generated method stub
				
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		try {

			Client client = entityManager.find(Client.class, idClient);
			entityManager.remove(client);

		} catch (NoResultException e) {
			e.getMessage();
			entityManager.close();
		}
		
	}

}
