package td3.blin;

import java.util.ArrayList;
import java.util.List;

public class Book extends Product {

	private ArrayList<String> authors;
	private String editor;

	public Book(String description, Double price, String name, List<String> authors, String editor) {
		super(description, price,name);
		this.authors = new ArrayList<String>(authors);
		this.editor = editor;
	}

	public Book(Book b) {
		this(b.getDescription(), b.getPrice(),b.getName(), b.authors, b.editor);
	}

	public List<String> getAuthors() {
		return new ArrayList<String>(authors);
	}

	public void setAuthors(List<String> authors) {
		this.authors = new ArrayList<String>(authors);
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public Product getCopy() {
		return new Book(this);
	}

	@Override
	public ProductType getType() {
		return ProductType.Book;
	}

	@Override
	public String toString() {
		return super.toString() + " - Authors: " + authors + " - Editor: " + editor;
	}
}
