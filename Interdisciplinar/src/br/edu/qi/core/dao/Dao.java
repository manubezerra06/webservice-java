package br.edu.qi.core.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Dao {

	private EntityManager manager;
	private boolean beginTransaction;

	public Dao() {
		
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		EntityManagerFactory FACTORY = Persistence
				.createEntityManagerFactory("interdisciplinar");
		manager = FACTORY.createEntityManager();

	}

	public <T extends Object> void salvar(T e) {

		if (!beginTransaction)
			manager.getTransaction().begin();
		
		manager.persist(e);

		if (!beginTransaction) {
			manager.getTransaction().commit();
		}
	}

	public <T> List<T> retornarTodos(String tableName) {

		if (!beginTransaction)
			manager.getTransaction().begin();

		// String tableName = clazz.getName();
		Query query = manager.createQuery("SELECT x FROM " + tableName + " x");
		List<T> objects = query.getResultList();

		if (!beginTransaction)
			manager.getTransaction().commit();

		return objects;
	}

	public <T> T retornarPorId(Class<T> entityClass, int id) {

		if (!beginTransaction)
			manager.getTransaction().begin();

		T entity = manager.find(entityClass, id);

		if (!beginTransaction)
			manager.getTransaction().commit();

		return entity;
	}
	
	public <T> T retornarPorId(Class<T> entityClass, String id) {

		if (!beginTransaction)
			manager.getTransaction().begin();

		T entity = manager.find(entityClass, id);

		if (!beginTransaction)
			manager.getTransaction().commit();

		return entity;
	}

	public void beginTransaction() {
		beginTransaction = true;
		manager.getTransaction().begin();
	}

	public void commit() {
		beginTransaction = false;
		manager.getTransaction().commit();
	}
}
