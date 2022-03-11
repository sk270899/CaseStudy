package com.pizzamanagement.Ui;

import com.pizzamanagement.service.PizzaService;
import com.pizzamanagement.model.Pizza;
import com.pizzamanagement.service.PizzaServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		PizzaService service = new PizzaServiceImpl();
		
		// creating pizza object
		Pizza pizza1 = new Pizza(121, "marghrerita", 599, "jaipur");
		Pizza pizza2 = new Pizza(122, "cheezBurst", 799, "chennai");
		Pizza pizza3 = new Pizza(123, "farmhouse", 699, "Hyderabad");
		
		//sending pizza object to service layer via addPizza method
		service.addPizza(pizza1);
		service.addPizza(pizza2);
		service.addPizza(pizza3);
		
		//CRUD operations on pizza-layered-JPA-Project
		Pizza pizza122 = service.findPizzaByNo(122);
		System.out.println(pizza122);
		pizza3 = new Pizza(123, "fastPizza", 699, "jagatpura");
		service.updatePizza(pizza3);
		System.out.println(service.findPizzaByNo(123));
		service.deletePizza(pizza2);
		System.out.println(service.findPizzaByNo(122));
		Pizza pizza4 = new Pizza(122, "newPizza", 699, "newAdd");
		service.addPizza(pizza4);
		System.out.println(service.findPizzaByNo(122));
	}
}


/*
 ---------------------------postgres SQL shell output------------------------------
 
 student=# \d
          List of relations
 Schema |   Name   | Type  |  Owner
--------+----------+-------+----------
 public | bonus    | table | postgres
 public | book     | table | postgres
 public | dept     | table | postgres
 public | dummy    | table | postgres
 public | emp      | table | postgres
 public | facebook | table | postgres
 public | pizza    | table | postgres
 public | salgrade | table | postgres
 public | studdata | table | postgres
(9 rows)


student=# \dt pizza
         List of relations
 Schema | Name  | Type  |  Owner
--------+-------+-------+----------
 public | pizza | table | postgres
(1 row)


student=# select * from pizza;
 pizzano | deliveryadd | pizzaprice |  pizzatype
---------+-------------+------------+-------------
     121 | jaipur      |        599 | marghrerita
     123 | jagatpura   |        699 | fastPizza
(2 rows)


student=# select * from pizza;
 pizzano | deliveryadd | pizzaprice |  pizzatype
---------+-------------+------------+-------------
     121 | jaipur      |        599 | marghrerita
     123 | jagatpura   |        699 | fastPizza
     122 | newAdd      |        699 | newPizza
(3 rows)

 ------------------------CONSOLE OUTPUT--------------------------------
 
 
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Hibernate: insert into Pizza (deliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Hibernate: insert into Pizza (deliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Hibernate: insert into Pizza (deliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Pizza [pizzaNo=122, pizzaType=cheezBurst, pizzaPrice=799, deliveryAdd=chennai]
Hibernate: update Pizza set deliveryAdd=?, pizzaPrice=?, pizzaType=? where pizzaNo=?
Pizza [pizzaNo=123, pizzaType=fastPizza, pizzaPrice=699, deliveryAdd=jagatpura]
Hibernate: delete from Pizza where pizzaNo=?
Hibernate: select pizza0_.pizzaNo as pizzaNo0_0_, pizza0_.deliveryAdd as delivery2_0_0_, pizza0_.pizzaPrice as pizzaPrice0_0_, pizza0_.pizzaType as pizzaType0_0_ from Pizza pizza0_ where pizza0_.pizzaNo=?
null
Hibernate: insert into Pizza (deliveryAdd, pizzaPrice, pizzaType, pizzaNo) values (?, ?, ?, ?)
Pizza [pizzaNo=122, pizzaType=newPizza, pizzaPrice=699, deliveryAdd=newAdd]

*/
