package edu.ty.driver.view;

import edu.ty.driver.controller.DAO;

public class View {

	public static void main(String[] args) {

		DAO dao=new DAO();
//		dao.insetVehicle();
		dao.updateMilageById(10, 15);
	}

}
