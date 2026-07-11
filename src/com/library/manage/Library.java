package com.library.manage;

public class Library {

	private int id;
	private String name;
	private String author;
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Library(int id, String name, String author, int price) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Library(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Library() {
		super();
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

}
