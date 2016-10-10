package main.com.foo.item;

/**
 * Generic interface to represent any item that can be sold in a basket
 * Interface main defines two method price and describe 
 * 
 * @author tusharpawar
 *
 */
public interface Sellable {
	/** Price of the item 
	 * (implementation is on the concrete class in terms of how price is determined ie by weight , per items , with discount etc)
	 * @return
	 */
	double price();

	/**
	 * Describes or prints information about the  <Sellable> item
	 */
	void describe();
}