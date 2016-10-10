package main.com.foo.item;

import main.com.foo.item.Sellable;

/**
 * Generic implementation for an Fruit <Sellable> item.
 * This class can used to create Fruit objects with the required base price
 * 
 * @author tushar pawar
 *
 */
public class Fruit implements Sellable {

	private double price;
	private String name;

	/**
	 * Public constructor to create a a fruit object with name and base cost
	 * 
	 * @param costPerItem
	 * @param name
	 */
	public Fruit(String name, double costPerItem) {
		this.price = costPerItem;
		this.name = name;
	}
   
	
	/**
	 * @see main.com.foo.item.Sellable#price()
	 * cost of Fruits can be calculated in desired way , if some some fruits need cost in weight etc 
	 * than the constructor can be overloaded
	 */
	@Override
	public double price() {
		return price;
	}

	/**
	 * @see main.com.foo.item.Sellable#describe()
	 * Fruits as descried with name and associated price
	 */
	@Override
	public void describe() {
		System.out.println("Fruit  " + name + "   with price of " + price + ".");
	}

}