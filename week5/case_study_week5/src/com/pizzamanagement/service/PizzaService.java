package com.pizzamanagement.service;

import com.pizzamanagement.model.Pizza;


// service layer interface 
// this layer communicates with the UI layer
public interface PizzaService {
	
	// CRUD functions for CRUD operations
	void addPizza(Pizza pizza);
	void updatePizza(Pizza pizza);
	void deletePizza(Pizza pizza);
	Pizza findPizzaByNo(int no);
	
}
