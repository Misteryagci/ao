package td3.blin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StoreImpl implements Store {

	private HashMap<Integer,Basket> baskets;
	private CatalogUserItf cat;
	
	public StoreImpl(CatalogUserItf cat) {
		baskets = new HashMap<Integer,Basket>();
		this.cat=cat;
	}

	public int newBasket(){
		Basket b =new BasketImpl(cat);
		baskets.put(b.getId(),b);
		return b.getId();
	}
	
	public List<Integer> getAllBaskets(){
		ArrayList<Integer> l= new ArrayList<Integer>();
		for (Basket basket : baskets.values()) {
			l.add(basket.getId());
		}
		return l;
	}
	
	private Basket findBasketById(int basketId){
		Basket b=baskets.get(basketId);
		if(b==null){
			throw new IllegalArgumentException("Undefined basket Id");
		}
		return b;
	}

	@Override
	public void addProductInBasket(int basketId, int productId, int quantity) {
		findBasketById(basketId).addProductInBasket(productId, quantity);
	}

	@Override
	public void removeProductInBasket(int basketId, int productId) {
		findBasketById(basketId).removeProductFromBasket(productId);
	}

	@Override
	public void updateQuantityProductInBasket(int basketId, int productId,
			int quantity) {
		findBasketById(basketId).updateQuantityProductInBasket(productId, quantity);
	}

	@Override
	public double computePriceOfBasket(int basketId) {
		return findBasketById(basketId).computePriceOfBasket();
	}

	@Override
	public void validateBasket(int basketId) {
		throw new UnsupportedOperationException("This function is not yet implemented");
	}
	
	@Override
	public List<IntegerPair> getBasketEntries(int basketId) {
		return findBasketById(basketId).getBasketEntries();
	}
	
	@Override
	public String toString() {
		String res="";
		for (Basket basket : baskets.values()) {
			res+="Basket "+basket.getId()+"\n";
			res+=basket.toString();
			res+="\n\n";
		}
		return res;
	}
}
