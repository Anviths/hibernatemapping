package edu.ty.view;

import edu.ty.socialmedia.controller.DAO;

public class View {

	public static void main(String[] args) {
		DAO dao=new DAO();
		dao.createPerson();
//		dao.updateageById(1, 25);
	}
}
