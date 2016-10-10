package main.com.foo.basket;

import java.util.ArrayList;
import java.util.List;

import main.com.foo.item.Sellable;

/**
 * Generic Shopping Basket where items can be added
 * 
 * @author tusharpawar
 *
 * @param <T>
 */
public class Basket<T extends Sellable> {

	private List<T> items;

	/**
	 * initialize the basket
	 */
	public Basket() {
		super();
		this.items = new ArrayList<T>();
	}

	/**
	 * Add a single <Sellable> item to the basket
	 * 
	 * @param item
	 */
	public void addItem(T item) {
		if (item == null)
			new IllegalStateException();
		items.add(item);
	}

	/**
	 * Add a List of <Sellable> items to the basket if list contains a null
	 * element IllegalStateException exception is thrown
	 * 
	 * @param items
	 */
	public void addItems(List<T> items) {
		if (items.contains(null))
			throw new IllegalStateException();
		this.items.addAll(items);
	}

	/**
	 * Get a list of all <Sellable> items in basket
	 * 
	 * @return
	 */
	public List<T> getItems() {
		return this.items;
	}

	/**
	 * Get a cost of all <Sellable> items in the basket
	 * 
	 * @return
	 */
	public double getCost() {
		return getItems().stream().mapToDouble(Sellable::price).sum();
	}

	/**
	 * Describe all the <Sellable> items in the basket
	 * 
	 * @return
	 */
	public void describe() {
		getItems().forEach(item -> item.describe());
	}
}
