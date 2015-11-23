package td3.blin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketImpl implements Basket {

	/**
	 * static field (shared by all instances)
	 */
	private static int SERIAL_COUNTER = 1;

	/**
	 * A Basket is a set of Basket entries
	 */
	private HashMap<Integer, Integer> basketEntries = new HashMap<Integer, Integer>();

	/**
	 * Automatic computed id field corresponding to the number of calls to the
	 * constructor method
	 */
	private final int id = SERIAL_COUNTER++;

	/**
	 * Reference to a Catalog listing all the Products one can sell
	 */
	private CatalogUserItf c;

	public BasketImpl(CatalogUserItf c) {
		this.c = c;
	}

	@Override
	public void emptyBasket() {
		basketEntries.clear();
	}

	/**
	 * @param productId
	 *            Product Identifier to be seek
	 * @return true if it belongs to the Basket
	 */
	private boolean contains(int productId) {
		return basketEntries.containsKey(productId);
	}

	@Override
	public void addProductInBasket(int productId, int quantity) {
		if (!contains(productId)) {
			basketEntries.put(productId, quantity);
		} else {
			basketEntries.put(productId, basketEntries.get(productId) + quantity);
		}
	}

	@Override
	public void updateQuantityProductInBasket(int productId, int quantity) {
		if (!contains(productId)) {
			throw new UnsupportedOperationException("Product not already in the basket");
		} else {
			basketEntries.put(productId, quantity);
		}

	}

	@Override
	public void removeProductFromBasket(int productId) {
		if (basketEntries.remove(productId) == null) {
			throw new UnsupportedOperationException("Product not already in the basket");
		}
	}

	@Override
	public double computePriceOfBasket() {
		double res = 0;
		for (Map.Entry<Integer, Integer> basketEntry : basketEntries.entrySet()) {
			res += c.getPrice(basketEntry.getKey()) * basketEntry.getValue();
		}
		return res;
	}

	@Override
	public void validateBasket() {
		throw new UnsupportedOperationException("This function is not implemented yet");
	}

	@Override
	public boolean isBasketValid() {
		throw new UnsupportedOperationException("This function is not implemented yet");
	}

	@Override
	public String toString() {
		String s = new String();
		for (Map.Entry<Integer, Integer> basketEntry : basketEntries.entrySet()) {
			s = s.concat(c.getDescription(basketEntry.getKey()) + ":" + c.getPrice(basketEntry.getKey()) + " (" + basketEntry.getValue() + " times)\n");
		}
		return s;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public List<IntegerPair> getBasketEntries() {
		List<IntegerPair> l = new ArrayList<IntegerPair>();
		for (Map.Entry<Integer, Integer> basketEntry : basketEntries.entrySet()) {
			l.add(new IntegerPair(basketEntry.getKey(), basketEntry.getValue()));
		}
		return l;
	}
}
