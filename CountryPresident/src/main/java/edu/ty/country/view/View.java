package edu.ty.country.view;

import edu.ty.country.controller.DAO;

public class View {

	public static void main(String[] args) {

		DAO dao=new DAO();
//		dao.insretPresident();
		dao.updatePresidentAgeById(1, 66);
	}

}
