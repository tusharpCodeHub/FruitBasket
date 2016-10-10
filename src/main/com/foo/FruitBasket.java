package main.com.foo;

import java.util.Arrays;

import main.com.foo.basket.Basket;
import main.com.foo.item.Fruit;
import main.com.foo.item.Sellable;

/**
 * Main Class to create a basket and output the cost
 * 
 * @author tusharpawar
 *
 */
public class FruitBasket {

	public static void main(String[] args) {
		// Initialize a new fruits with base cost
		final Fruit mango = new Fruit("Mango", 1.25);
		final Fruit orange = new Fruit("Orange", 1);
		final Fruit banana = new Fruit("Banana", 0.50);
		final Fruit peach = new Fruit("Peach", 0.25);
		final Fruit apple = new Fruit("Apple", 0.95);

		Basket<Sellable> basket = new Basket<Sellable>();
		basket.addItems(Arrays.asList(mango, peach, mango, banana, orange, apple));
		// describe the contents of basket
		basket.describe();
		// get the total cost of the items in the basket
		System.out.println("Total Cost of the Basket is  " + basket.getCost() +".");
		

	}
}
