package main.com.foo.item;

/**
 * Generic interface to represent any item that can go sold in a basket
 * 
 * @author tusharpawar
 *
 */
public interface Sellable {
	double price();

	void describe();
}