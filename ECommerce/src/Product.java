/* 
 * File name: Product.java
 * Author: Tharindya Anjalika
 * Date: 09/07/2024
 * Purpose: Understand and implement the concept of polymorphism
 */
public abstract class Product {

	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private double price;
	/**
	 * 
	 */
	private String category;
	
	/**
	 * Constructor for the Product variables
	 * @param name
	 * @param price
	 * @param category
	 */
	public Product(String name,double price, String category) {
		this.name=name;
		this.price=price;
		this.category=category;
	}
	/**
	 * getter for the name 
	 * @return
	 */
	public String getname() {
		return name;
	}
	/**
	 * setter for the name
	 * @param name
	 */
	public void setname(String name) {
		this.name=name;
	}
	/**
	 * getter for the price
	 * @return
	 */
	public double getprice() {
		return price;
	}
	/**
	 * setter for the price
	 * @param price
	 */
	public void setprice(double price) {
		this.price=price;
	}
	/**
	 * getter for the category
	 * @return
	 */
	public String getcategory() {
		return category;
	}
	/**
	 * setter for the category
	 * @param category
	 */
	public void setcategory(String category) {
		this.category=category;
	}
	
	public abstract String toString();
	public abstract String purchaseProduct();
}
