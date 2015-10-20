package td3.blin;



public interface CatalogAdminItf {


	/**
	 * @param p
	 *            Product to be added
	 * @return the Identifier corresponding to the new created Product
	 */
	public int addProductInCatalog(Product p);

	/**
	 * @param productId
	 *            of the Product to be removed from the Catalog
	 */
	public void removeProductInCatalog(int productId);

	
}
