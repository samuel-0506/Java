package com.javaconstructors;

public class Library {
	int bookId;
	String title;
	String author;
	
	Library(int bookId,String title,String author){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	Library(int bookId,String title, Library l){
		this.author=l.author;
		this.bookId=bookId;
		this.title=title;
		
	}

	public static void main(String[] args) {
		Library l = new Library(201,"Fairy Tails","Samuel");
		l.show();
		Library l1 = new Library(203,"One Piece",l);
		l1.show();

	}
	void show() {
		System.out.println("Book ID : "+ bookId);
		System.out.println("Book Title : "+ title);
		System.out.println("Book Author : "+ author);
	}
}
