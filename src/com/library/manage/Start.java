package com.library.manage;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		System.out.println("Welcome to Library Management App");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("PRESS 1 TO ADD Book");
			System.out.println("PRESS 2 TO DELETE Book");
			System.out.println("PRESS 3 TO DISPLAY Book");
			System.out.println("PRESS 4 TO UPDATE Book");
			System.out.println("PRESS 5 TO EXIT Book");

			int ch = sc.nextInt();
			sc.nextLine();

			if (ch == 1) {
				// add book
				System.out.print("Enter book name: ");
				String name = sc.nextLine();

				System.out.print("Enter book author: ");
				String author = sc.nextLine();

				System.out.print("Enter book price: ");
				int price = sc.nextInt();

				Library lib = new Library(name, author, price);

				boolean ans = Library_Management.insertBookToDB(lib);

				if (ans) {
					System.out.println("Book is added to library...");
				} else {
					System.out.println("Something is wrong...");
				}
			} else if (ch == 2) {

				// delete book
				System.out.println("Enter book id to delete: ");
				int bookId = sc.nextInt();

				boolean f = Library_Management.deleteBook(bookId);

				if (f) {
					System.out.println("Successfully deleted book from library...");
				} else {
					System.out.println("Something went wrong");
				}
			} else if (ch == 3) {

				// display book
				Library_Management.showAllBook();

			} else if (ch == 4) {

				// update book
				System.out.println("Enter bookId to update: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter new book name: ");
				String name = sc.nextLine();

				System.out.println("Enter new author: ");
				String author = sc.nextLine();

				System.out.println("Enter new price: ");
				int price = sc.nextInt();

				Library lib = new Library(id, name, author, price);

				boolean ans = Library_Management.updateBook(lib);

				if (ans) {
					System.out.println("Book updated succesfully...");
				} else {
					System.out.println("Something went wrong...");
				}

			} else if (ch == 5) {
				// exit
				break;
			}
			else {

			}

		}

		System.out.println("Thanking for using my application...");
		System.out.println("See you soon... bye bye");
	}

}
