package edu.ty.user.view;

import edu.ty.user.controller.DAO;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DAO dao=new DAO();
//		dao.createUser();
		dao.updateNameById(1, "komala");
	}

}
