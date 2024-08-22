/* 
 * File name: Emain.java
 * Author: Tharindya Anjalika
 * Date: 09/07/2024
 * Purpose: Understand and implement the concept of polymorphism
 */
public class lab5Main {
	
	public static void main(String[] args) {

		PhysicalProduct PhyPro = new PhysicalProduct("Action Figure", 524.99, "Toys", 5.99, 0.9);
		DigitalProduct DigiPro = new DigitalProduct("Digital HandBook", 14.49, "Books", 24, "www.AhasMaliga.Com");
		
		System.out.println(PhyPro.toString());
		System.out.println(PhyPro.purchaseProduct());
		
		System.out.println();
		System.out.println(DigiPro.toString());
		System.out.println(DigiPro.purchaseProduct());
		
	}

}
