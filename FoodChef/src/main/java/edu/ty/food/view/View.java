package edu.ty.food.view;

import edu.ty.food.controller.DAO;

public class View {

	public static void main(String[] args) {

		DAO dao=new DAO();
//		dao.createFood();
		dao.updatePriceById(101, 500);
	}

}
