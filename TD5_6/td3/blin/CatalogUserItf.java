package td3.blin;

import java.util.List;

public interface CatalogUserItf {

	/**
	 * @return a list of Products Identifiers
	 */
	public List<Integer> listProduct();

	/**
	 * @param productId
	 *            of the Product of interest
	 * @return its price
	 */
	public double getPrice(int productId);

	/**
	 * @param productId
	 *            of the Product of interest
	 * @return its description
	 */
	public String getDescription(int productId);

	public List<Integer> findProductByType(String type);

	public List<Integer> listProductByIncreasingPrice();

	String getName(int productId);

}
