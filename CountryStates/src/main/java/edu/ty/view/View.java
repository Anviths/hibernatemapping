package edu.ty.view;

import edu.ty.controller.DAO;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DAO dao=new DAO();
//		dao.addCountry();
		dao.updateCountryAreaById(1, 8000000);
	}

}
