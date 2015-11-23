package td3.blin;

public class Game extends Product {

	private String creator;

	public Game(String description, Double price, String name, String creator) {
		super(description, price,name);
		this.creator = creator;
	}

	public Game(Game b) {
		this(b.getDescription(), b.getPrice(),b.getName(), b.creator);
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public Product getCopy() {
		return new Game(this);
	}

	@Override
	public ProductType getType() {
		return ProductType.Book;
	}

	@Override
	public String toString() {
		return super.toString() + " - Creator: " + creator;
	}
}
