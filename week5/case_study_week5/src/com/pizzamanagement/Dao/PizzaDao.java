package com.pizzamanagement.Dao;

import com.pizzamanagement.model.Pizza;
public interface PizzaDao {
	//methods for CRUD operations at the database level.
	Pizza getPizzaByNo(int no);
	void addPizza(Pizza pizza);
	void updatePizza(Pizza pizza);
	void deletePizza(Pizza pizza);
	void commitTransaction();
	void beginTransaction();
	
}
