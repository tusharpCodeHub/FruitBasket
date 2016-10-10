package test.com.foo;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import main.com.foo.basket.Basket;
import main.com.foo.item.Fruit;
import main.com.foo.item.Sellable;

/**Few Basic Junit Test Classes for FruitBasket
 * @author tusharpawar
 *
 */
public class FruitBasketTest {

	@Test
	public void testEmptyBasket() {

		Basket<Sellable> basket = new Basket<Sellable>();
		basket.describe();
		Assert.assertTrue(basket.getCost() == 0);
	}

	@Test
	public void testAddAllFruitsToBasket() {

		final Fruit mango = new Fruit("Mango", 1.25);
		final Fruit orange = new Fruit("Orange", 1);
		Basket<Sellable> basket = new Basket<Sellable>();
		basket.addItems(Arrays.asList(mango, orange));
		Assert.assertTrue(basket.getCost() == 2.25);
	}
	
	@Test
	public void testAddFruitToBasket() {

		final Fruit mango = new Fruit("Mango", 1.25);
		final Fruit orange = new Fruit("Orange", 1);
		Basket<Sellable> basket = new Basket<Sellable>();
		basket.addItem(mango);
		basket.addItem(orange);
		Assert.assertTrue(basket.getCost() == 2.25);
	}
	
	@Test(expected=IllegalStateException.class)
	public void testAddAllFruitsToBasketWithOneNull() {

		final Fruit mango = new Fruit("Mango", 1.25);
		final Fruit orange = new Fruit("Orange", 1);
		Basket<Sellable> basket = new Basket<Sellable>();
		basket.addItems(Arrays.asList(mango, orange , null));
		
	}
	
	@Test
	public void testFruitCreation() {

		final Fruit mango = new Fruit("Mango", 1.25);
		Assert.assertTrue(mango.price() == 1.25);
	}
}
