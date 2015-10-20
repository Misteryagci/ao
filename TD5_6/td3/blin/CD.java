package td3.blin;

import java.util.ArrayList;
import java.util.List;

public class CD extends Product {

	private ArrayList<String> artists;
	private String editor;

	public CD(String description, Double price, String name, List<String> artists, String editor) {
		super(description, price,name);
		this.artists = new ArrayList<String>(artists);
		this.editor = editor;
	}

	public CD(CD b) {
		this(b.getDescription(), b.getPrice(),b.getName(),  b.artists, b.editor);
	}

	public ArrayList<String> getArtists() {
		return artists;
	}

	public void setArtists(List<String> artists) {
		this.artists = new ArrayList<String>(artists);
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public Product getCopy() {
		return new CD(this);
	}

	@Override
	public ProductType getType() {
		return ProductType.Book;
	}

	@Override
	public String toString() {
		return super.toString() + " - Artists: " + artists + " - Editor: " + editor;
	}
}
