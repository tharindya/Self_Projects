/* 
 * File name: PhysicalProduct.java
 * Author: Tharindya Anjalika
 * Course: CST8132 – OOP
 * Assignment: Lab 5
 * Date: 09/07/2024
 * Professor: Islam Gomaa
 * Purpose: Understand and implement the concept of polymorphism
 */
public class PhysicalProduct extends Product{

	/**
	 * weight variable
	 */
	private double weight;
	/**
	 * shipping cost variable
	 */
	private double ShippingCost;
	
	/**
	 * Constructor for the PhysicalProduct variables and extended costrcutor from the Product
	 * @param name
	 * @param price
	 * @param category
	 * @param ShippingCost
	 * @param weight
	 */
	public PhysicalProduct(String name, double price, String category, double ShippingCost, double weight) {
		super(name, price, category);
		this.ShippingCost = ShippingCost;
		this.weight = weight;
		
	}
	/**
	 * getter for the weight
	 * @return weight
	 */
	public double getweight() {
		return weight;
	}

	/**
	 * setter for the weight
	 * @param weight
	 */
	public void setweight(double weight) {
		this.weight = weight;
	}
	/**
	 * getter for the shippingCost
	 * @return ShippingCost
	 */
	public double getshippingCost() {
		return ShippingCost;
	}

	/**
	 * setter for the shipping cost
	 * @param ShippingCost
	 */
	public void setShippingCost(double ShippingCost) {
		this.ShippingCost = ShippingCost;
	}
	
	@Override
	public String toString() {
		return "Physical Product Details:\n"+"Product Name:"+getname()+"\nPrice: $"+
	            getprice()+ "\ncategory:"+getcategory()+"\nWeight:"+weight+"kg"+"\nShipping Cost: $"+ShippingCost;
	}

	@Override
	public String purchaseProduct() {
		return "Your Physical Product is going to be shipped soon.";
	}

}
