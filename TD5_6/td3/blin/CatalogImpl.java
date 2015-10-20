package td3.blin;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CatalogImpl implements CatalogUserItf, CatalogAdminItf {
	/**
	 * Field used to implement a Singleton Pattern for the CatalogImpl Class
	 */
	private static volatile CatalogImpl instance = null;

	private ArrayList<Product> catalog;

	/**
	 * The constructor is private for the Singleton Pattern implementation
	 */
	private CatalogImpl() {
		catalog = new ArrayList<Product>();
	}

	/**
	 * Method returning the only instance of a Catalog due to Singleton Pattern
	 * 
	 * @return the only Catalog reference
	 */
	public final static CatalogUserItf getUserItfInstance() {
		if (CatalogImpl.instance == null) {
			synchronized (CatalogImpl.class) { // In case of multi-threaded use
				if (CatalogImpl.instance == null) {
					CatalogImpl.instance = new CatalogImpl();
				}
			}
		}
		return CatalogImpl.instance;
	}

	public final static CatalogAdminItf getAdminItfInstance() {
		if (CatalogImpl.instance == null) {
			synchronized (CatalogImpl.class) { // In case of multi-threaded use
				if (CatalogImpl.instance == null) {
					CatalogImpl.instance = new CatalogImpl();
				}
			}
		}
		return CatalogImpl.instance;
	}

	@Override
	public List<Integer> listProduct() {
		ArrayList<Integer> prods = new ArrayList<Integer>();
		for (Product p : catalog) {
			prods.add(p.getId());
		}
		return prods;
	}

	@Override
	public int addProductInCatalog(Product p) {
		catalog.add(p);
		return p.getId();
	}

	@Override
	public void removeProductInCatalog(int productId) {
		for (Iterator<Product> iterator = catalog.iterator(); iterator.hasNext();) {
			// Iterator cannot be avoided since one need to modify the list
			Product product = (Product) iterator.next();
			if (product.getId() == productId) {
				iterator.remove();
				return;
			}
		}

	}

	@Override
	public double getPrice(int productId) {
		for (Product product : catalog) {
			if (product.getId() == productId)
				return product.getPrice();
		}
		throw new InvalidParameterException("Product id not found");
	}

	@Override
	public String getDescription(int productId) {
		for (Product product : catalog) {
			if (product.getId() == productId)
				return product.getDescription();
		}
		throw new InvalidParameterException("Product id not found");
	}

	@Override
	public String getName(int productId) {
		for (Product product : catalog) {
			if (product.getId() == productId)
				return product.getName();
		}
		throw new InvalidParameterException("Product id not found");
	}
	
	@Override
	public List<Integer> findProductByType(String type) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (Product product : catalog) {
			if (product.getType().equals(type)) {
				result.add(product.getId());
			}
		}
		return result;
	}

	@Override
	public List<Integer> listProductByIncreasingPrice() {
		ArrayList<Product> result = new ArrayList<Product>();
		for (Product product : catalog) {
			result.add(product.getCopy());
		}
		result.sort(new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				if (o1.getPrice() < o2.getPrice())
					return -1;
				if (o1.getPrice() > o2.getPrice())
					return 1;
				return 0;
			}

		});
		ArrayList<Integer> trueresult = new ArrayList<Integer>();
		for (Product product : result) {
			trueresult.add(product.getId());
		}
		return trueresult;
	}
}
