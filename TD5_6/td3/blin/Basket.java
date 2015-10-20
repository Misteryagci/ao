package td3.blin;

import java.util.List;

/**
 * A Basket is a set of triples composed of a Client Identifier, a Product Identifier and a quantity
 */
public interface Basket {
	
	/**
	 * Remove any entries of the Basket
	 */
	public void emptyBasket();

	/**
	 * @param productId Product Identifier to be added to the Basket
	 * @param quantity of the corresponding Product
	 */
	public void addProductInBasket(int productId, int quantity);

	/**
	 * @param productId Product Identifier which quantity has to be updated in the Basket
	 * @param quantity The updated quantity
	 */
	public void updateQuantityProductInBasket(int productId, int quantity);

	/**
	 * @param productId Product Identifier to be removed from the Basket
	 */
	public void removeProductFromBasket(int productId);

	/**
	 * @return the total price of the Basket
	 */
	public double computePriceOfBasket();

	/**
	 * Validate the basket
	 */
	public void validateBasket();
	
	/**
	 * @return true if the Basket has been validated yet
	 */
	public boolean isBasketValid();
	
	/**
	 * @return the Identifier of the Basket
	 */
	public int getId();
	
	/**
	 * 
	 * @return a List composed of integer pairs corresponding to (ProductId,Quantity)
	 */
	public List<IntegerPair> getBasketEntries();
}
