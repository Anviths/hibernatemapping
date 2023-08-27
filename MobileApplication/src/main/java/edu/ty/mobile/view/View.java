package edu.ty.mobile.view;

import edu.ty.mobile.controller.DAO;

public class View {

	public static void main(String[] args) {

		DAO dao=new DAO();
//		dao.addMobile();
		dao.updateMobilePriceById(1, 45000);
	}

}
