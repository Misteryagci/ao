package td3.blin;

import java.util.List;

/**
 * A Store is represented by a set of Baskets
 */
public interface Store {

	/**
	 * @return the Basket Identifier of the newly created Basket
	 */
	public int newBasket();

	/**
	 * @return All the Basket Identifiers 
	 */
	public List<Integer> getAllBaskets();

	/**
	 * @param basketId
	 *            Basket Identifier where the product has to be added
	 * @param productId
	 *            Product Identifier to be added to the Basket
	 * @param quantity
	 *            of the corresponding Product
	 */
	public void addProductInBasket(int basketId, int productId, int quantity);

	/**
	 * @param basketId
	 *            Basket Identifier where the product has to be removed
	 * @param productId
	 *            Product Identifier to be added to the Basket
	 */
	public void removeProductInBasket(int basketId, int productId);

	/**
	 * @param basketId
	 *            Basket Identifier where the quantity of the product has to be
	 *            updated
	 * @param productId
	 *            Product Identifier which quantity has to be updated in the
	 *            Basket
	 * @param quantity
	 *            The updated quantity
	 */
	public void updateQuantityProductInBasket(int basketId, int productId,
			int quantity);

	/**
	 * @param basketId
	 *            Basket Identifier
	 * @return the total price of the corresponding Basket
	 */
	public double computePriceOfBasket(int basketId);

	/**
	 * @param basketId
	 *            Basket Identifier Validate the corresponding basket
	 */
	public void validateBasket(int basketId);

	public List<IntegerPair> getBasketEntries(int basketId);
	
	public String toString();
}
