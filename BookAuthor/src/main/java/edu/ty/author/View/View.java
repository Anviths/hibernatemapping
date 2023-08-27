package edu.ty.author.View;

import edu.ty.author.controller.DAO;

public class View {

	public static void main(String[] args) {

		DAO dao=new DAO();
//		dao.addBook();
		dao.updateBookPriceById(101, 500);
	}

}
