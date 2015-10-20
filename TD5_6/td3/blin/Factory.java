package td3.blin;


/**
 * Object Factory returning implementations of the Interfaces of the project
 */
public class Factory {
	
	/**
	 * @param cat Catalog on which the Store will be based
	 * @return a Store base on cat
	 */
	public static Store newStore(CatalogUserItf cat){
		return new StoreImpl(cat);
	}
	
	/**
	 * @return a unique shared Catalog
	 */
	public static CatalogAdminItf getAdminCatalog(){
		return CatalogImpl.getAdminItfInstance();
	}
	/**
	 * @return a unique shared Catalog
	 */
	public static CatalogUserItf getUserCatalog(){
		return CatalogImpl.getUserItfInstance();
	}
}
