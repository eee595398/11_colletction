package edu.kh.collection.model.svo;

public class Book {

	private String bookname;
	private String  name;
	private int price;
	private String namename;
	public Book(String bookname, String name, int price, String namename) {
		super();
		this.bookname = bookname;
		this.name = name;
		this.price = price;
		this.namename = namename;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNamename() {
		return namename;
	}
	public void setNamename(String namename) {
		this.namename = namename;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", name=" + name + ", price=" + price + ", namename=" + namename + "]";
	}
	
	
	
}
