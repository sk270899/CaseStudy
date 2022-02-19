package com.casestudyweek3;

import java.util.HashMap;
import java.util.Scanner;

public class Product {
	private int id;
	private String name; 
	private int ammount; 
	private int code; 
	private String address; 
	private int pincode;
	
	static Scanner sc = new Scanner(System.in);
	
	Product() {}
	Product(int id, String name, int ammount, int code, String address, int pincode) {
		this.id = id;
		this.name = name;
		this.ammount = ammount;
		this.code = code;
		this.address = address;
		this.pincode = pincode;
	}
	
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", ammount=" + ammount + ", code=" + code + ", address="
				+ address + ", pincode=" + pincode + "]";
	}



	static HashMap<Integer,Product> database = new HashMap<>();
	
	
	public static void addProduct(Product product) {
		
		database.put(product.id, product);
	}
	
	public static void updateProduct(int id) {
		Product myProduct = new Product();
		myProduct = database.get(id);
		System.out.println("what you want to update in " + myProduct.name + " ??");
		System.out.println(	"1. Update name" 
							+ "\n" + "2. Update ammount" 
							+ "\n" + "3. Update Product code" 
							+ "\n" + "4. Update address" 
							+ "\n" + "5. Update pincode" 
							+ "\n" + "You can't change product id.");
		
		System.out.println("Enter numeric input : ");
		int update = sc.nextInt();
		switch (update) {
		case 1: {
			System.out.println("Enter new name for product : ");
			myProduct.name = sc.next();
			System.out.println("Updated new name to " + myProduct.name);
			break;
		}
		case 2: {
			System.out.println("Enter new ammount for product : ");
			myProduct.ammount = sc.nextInt();
			System.out.println("Updated new ammount to " + myProduct.ammount);
			break;
		}
		case 3: {
			System.out.println("Enter new code for product : ");
			myProduct.code = sc.nextInt();
			System.out.println("Updated new code to " + myProduct.code);
			break;
		}
		case 4: {
			System.out.println("Enter new address for product : ");
			myProduct.address = sc.next();
			System.out.println("Updated new address to " + myProduct.address);
			break;
		}
		case 5: {
			System.out.println("Enter new pincode for product : ");
			myProduct.pincode = sc.nextInt();
			System.out.println("Updated new pincode to " + myProduct.pincode);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + update);
		}
	}
	
	public static void deleteProduct(int id) {
		database.remove(id);
		System.out.println("Product deleted successfully...");
	}
	
	
	public static void getProduct(int id) {
		System.out.println(database.get(id).toString());
	}
	
	public static void getAllProducts() {
		for(int i : database.keySet()) {
			System.out.println(database.get(i).toString());
		}
	}
	public static void main(String[] args) {
		System.out.println("What you want to do ??");
		System.out.println("Enter 1 to continue : ");
		Scanner sc = new Scanner(System.in);
		int continueOrNot = sc.nextInt();
		while(continueOrNot == 1) {
			System.out.println(	"1. Add Product" 
					+ "\n" + "2. Update Product" 
					+ "\n" + "3. Delete Product" 
					+ "\n" + "4. Get Product" 
					+ "\n" + "5. Get All Product" );
			System.out.println("Enter numeric value : ");
			int x = sc.nextInt();
			
			switch (x) {
			case 1: {
				System.out.println("Enter details : ");
				int id;
				String name; 
				int ammount; 
				int code; 
				String address; 
				int pincode;
				
				System.out.println("Enter the id of product : ");
				id = sc.nextInt();
				System.out.println("Enter product name : ");
				name = sc.next();
				System.out.println("Enter ammount of product : ");
				ammount = sc.nextInt();
				System.out.println("Enter product code : ");
				code = sc.nextInt();
				System.out.println("Enter address : ");
				address = sc.next();
				System.out.println("Enter pin code : ");
				pincode = sc.nextInt();
				
				Product myProduct = new Product(id, name, ammount, code, address, pincode);
				addProduct(myProduct);
				System.out.println("Product added Successfully...");
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			case 2: {
				System.out.println("Enter Product id to update : ");
				int updateId = sc.nextInt();
				updateProduct(updateId);
				System.out.println("Product updated successfully...");
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			case 3: {
				System.out.println("Enter Product id to delete : ");
				int deleteId = sc.nextInt();
				deleteProduct(deleteId);
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			case 4: {
				System.out.println("Enter Product id to get Product : ");
				int getId = sc.nextInt();
				getProduct(getId);
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			case 5: {
				getAllProducts();
				System.out.println("Enter 1 to continue : ");
				continueOrNot = sc.nextInt();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + x);
			}
		}
		sc.close();
		
	}

}



//---------------------OUTPUT-----------------------

/*

What you want to do ??
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
1
Enter details : 
Enter the id of product : 
10
Enter product name : 
laptop
Enter ammount of product : 
59999
Enter product code : 
1902
Enter address : 
chennai
Enter pin code : 
325121
Product added Successfully...
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
1
Enter details : 
Enter the id of product : 
11
Enter product name : 
charger
Enter ammount of product : 
999
Enter product code : 
9451
Enter address : 
jaipur
Enter pin code : 
302017
Product added Successfully...
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
1
Enter details : 
Enter the id of product : 
12
Enter product name : 
smartphomme
Enter ammount of product : 
19990
Enter product code : 
4512
Enter address : 
bangalore
Enter pin code : 
910911
Product added Successfully...
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
2
Enter Product id to update : 
12
what you want to update in smartphomme ??
1. Update name
2. Update ammount
3. Update Product code
4. Update address
5. Update pincode
You can't change product id.
Enter numeric input : 
1
Enter new name for product : 
smartphone
Updated new name to smartphone
Product updated successfully...
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
4
Enter Product id to get Product : 
12
Product [id=12, name=smartphone, ammount=19990, code=4512, address=bangalore, pincode=910911]
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
5
Product [id=10, name=laptop, ammount=59999, code=1902, address=chennai, pincode=325121]
Product [id=11, name=charger, ammount=999, code=9451, address=jaipur, pincode=302017]
Product [id=12, name=smartphone, ammount=19990, code=4512, address=bangalore, pincode=910911]
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
3
Enter Product id to delete : 
12
Product deleted successfully...
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
5
Product [id=10, name=laptop, ammount=59999, code=1902, address=chennai, pincode=325121]
Product [id=11, name=charger, ammount=999, code=9451, address=jaipur, pincode=302017]
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
1
Enter details : 
Enter the id of product : 
12
Enter product name : 
smartphone
Enter ammount of product : 
19990
Enter product code : 
4516
Enter address : 
bangalore
Enter pin code : 
990911
Product added Successfully...
Enter 1 to continue : 
1
1. Add Product
2. Update Product
3. Delete Product
4. Get Product
5. Get All Product
Enter numeric value : 
5
Product [id=10, name=laptop, ammount=59999, code=1902, address=chennai, pincode=325121]
Product [id=11, name=charger, ammount=999, code=9451, address=jaipur, pincode=302017]
Product [id=12, name=smartphone, ammount=19990, code=4516, address=bangalore, pincode=990911]
Enter 1 to continue : 
0

 */
