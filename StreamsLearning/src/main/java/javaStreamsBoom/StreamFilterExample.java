//Filtering using stream API

package javaStreamsBoom;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
	
	public static void main(String args[]) {
		
		//step3: Filtering products form the array list.
		
		//Note doing the filtering(applying the condition) in the treditional way.
		System.out.println("=======================Using normal approach=======================");
		List<Product> list= new ArrayList<>();//for storing the answer
		
		for(Product p: getProducts()) {
			if(p.getPrice()>80000f) {
				list.add(p);
			}
		}
		//printing the answer
		for(Product p: list) {
			System.out.println(p);
		}
		
		//NOTE::::::::Using Stream API::::::::::::::::::::://
		System.out.println("\n\n===========================Using Streams API============================================");
		//Model 1(converting stream to list and then printing the list
		System.out.println("Model 1");
		List<Product> ans= getProducts()
				.stream().filter((product)->product.getPrice()>80000f)
				.collect(Collectors.toList());//collect method is used to convert stream into list.
		ans.forEach(System.out::println);
		//Model 2(writing the condition and printing)
		System.out.println("Model 2");
		getProducts().stream().filter((product)->product.getPrice()>80000f).forEach(System.out::println);
		
		
		
	}
	
	//step2: Create a method to return list of products
	//Note here we are using static in the method creation. So we can access this method directly without creating the object.
	public static List<Product> getProducts(){
		List<Product> productsList= new ArrayList<>();
		productsList.add(new Product(435,"Dell",90000f));
		productsList.add(new Product(440,"Lenovo",75000f));
		productsList.add(new Product(435,"HP",99000f));
		productsList.add(new Product(435,"Accer",60000f));
		productsList.add(new Product(435,"Sony",89000f));
		return productsList;
	}

}


//Step1: Create a class having few fields about a product
class Product{
	private int id;
	private String name;
	private float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	
	//Note if we not use this method toString() method then we get the address values of the answer insted of text.
	//If we use it we get the text
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}



