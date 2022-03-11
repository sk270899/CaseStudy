package com.pizzamanagement.Dao;

import javax.persistence.EntityManager;
import com.pizzamanagement.model.Pizza;

//this is DAO layer which takes the object from Sercice layer and interacts with the Database.
//PizzaDaoImpl class implements PizzaDao interface to use its abstract methods
public class PizzaDaoImpl implements PizzaDao {

	//entityManager reference created
	private EntityManager entityManager;
	public PizzaDaoImpl() {
		//entityManager object given by 
		//a custom function getEntityManager() [inside JPAUtil.java] 
		//which uses entityManagerFactory to create a factory, 
		//which creates an entityManager Object.
		entityManager = JPAUtil.getEntityManager();
	}
	
	
	//addPizza method- taking pizza object from service layer 
	//and 
	//creating new pizza entry in the Entity(Table) for this object using persist method
	@Override
	public void addPizza(Pizza pizza) {
		entityManager.persist(pizza);
	}


	//updatePizza method- taking pizza object from service layer 
	//and 
	//updating existing pizza entry in the Entity(Table) for this object using merge method
	@Override
	public void updatePizza(Pizza pizza) {
		entityManager.merge(pizza);
	}


	//deletePizza method- taking pizza object from service layer 
	//and 
	//deleting existing pizza entry in the Entity(Table) of this object using remove method
	@Override
	public void deletePizza(Pizza pizza) {
		entityManager.remove(pizza);
	}
	
	//getPizzaByNo method- taking pizza object from service layer 
	//and 
	//fetching existing pizza entry in the Entity for this object using find method
	@Override
	public Pizza getPizzaByNo(int no) {
		Pizza pizza = entityManager.find(Pizza.class, no);
		return pizza;
	}
	
	
	//Transaction commit method to commit the transaction from Database
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	//Begin transaction method to begin any CRUD operation transaction
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}


}
