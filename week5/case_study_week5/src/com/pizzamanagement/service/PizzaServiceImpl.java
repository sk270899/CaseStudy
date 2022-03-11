package com.pizzamanagement.service;

import com.pizzamanagement.Dao.PizzaDao;
import com.pizzamanagement.Dao.PizzaDaoImpl;
import com.pizzamanagement.model.Pizza;

// PizzaServiceImpl class implements PizzaService interface to use its abstract methods
public class PizzaServiceImpl implements PizzaService {

	//DAO object reference created
	private PizzaDao daoOBJ;
	public PizzaServiceImpl() {
		//object is given to the reference
		daoOBJ = new PizzaDaoImpl();
	}
	
	//addPizza method- taking pizza object from UI layer 
	//and 
	//sending to DAO layer to create a new pizza entry for this object
	@Override
	public void addPizza(Pizza pizza) {
		daoOBJ.beginTransaction();
		daoOBJ.addPizza(pizza);
		daoOBJ.commitTransaction();
	}

	//addPizza method- taking pizza object from UI layer 
	//and 
	//sending to DAO layer for updating information in pizza entry in database
	@Override
	public void updatePizza(Pizza pizza) {
		daoOBJ.beginTransaction();
		daoOBJ.updatePizza(pizza);
		daoOBJ.commitTransaction();
	}

	//deletePizza method- taking pizza object from UI layer 
	//and 
	//sending to DAO layer for deleting the pizza entry from database
	@Override
	public void deletePizza(Pizza pizza) {
		daoOBJ.beginTransaction();
		daoOBJ.deletePizza(pizza);
		daoOBJ.commitTransaction();
	}

	//findPizzaByNo method- taking pizza object from UI layer 
	//and 
	//sending to DAO layer to fetch pizza object
	@Override
	public Pizza findPizzaByNo(int no) {
		//data fetch
		Pizza pizza = daoOBJ.getPizzaByNo(no);
		return pizza;
	}
	
}
