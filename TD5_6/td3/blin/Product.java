package td3.blin;

/**
 * A Product is represented as a triple a uniq ID, a description and a price
 */
public abstract class Product {

	/**
	 * static field (shared by all instances)
	 */
	private static int SERIAL_COUNTER = 1;
	private String description;
	private String name;
	private double price;
	/**
	 * Automatic computed id field corresponding to the number of calls to the
	 * constructor method
	 */
	private final int id = SERIAL_COUNTER++;

	public Product(String description, double price, String name) {
		this.description = description;
		this.price = price;
		this.name = name;
	}

	public Product(Product p) {
		this(p.description, p.price, p.name);
	}

	public abstract Product getCopy();

	public abstract ProductType getType();

	/**
	 * @return the price of the corresponding Product
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * @return the description of the corresponding Product
	 */
	public String getDescription() {
		return this.description;
	}

	public String getName() {
		return name;
	}

	/**
	 * @return the Identifier of the corresponding Product
	 */
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Description: " + description + " - Price: " + price + " - Type: " + getType();
	}

	@Override
	public int hashCode() {
		return new Integer(id).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Product))
			return false;
		Product p = (Product) obj;
		return (p.description.equals(description)) && p.getType().equals(getType());
	}

}
