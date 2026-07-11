package com.library.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Library_Management {

	public static boolean insertBookToDB(Library lib) {

		boolean f = false;
		try {

			Connection con = Connector.createC();

			String q = "insert into library(bname, bauthor, bprice) values(?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setString(1, lib.getName());
			pstmt.setString(2, lib.getAuthor());
			pstmt.setInt(3, lib.getPrice());

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public static boolean deleteBook(int bookId) {

		boolean f = false;
		try {
			Connection con = Connector.createC();

			String q = "delete from library where bid=?";

			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setInt(1, bookId);

			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public static void showAllBook() {

		try {

			Connection con = Connector.createC();

			String q = "select * from library ";

			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String author = set.getString(3);
				int price = set.getInt(4);

				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Author : " + author);
				System.out.println("Price : " + price);
				System.out.println("-----------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean updateBook(Library lib) {

		boolean f = false;

		try {

			Connection con = Connector.createC();

			String q = "update library set bname=?, bauthor=?, bprice=? where bid=?";

			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setString(1, lib.getName());
			pstmt.setString(2, lib.getAuthor());
			pstmt.setInt(3, lib.getPrice());
			pstmt.setInt(4, lib.getId());

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

}
