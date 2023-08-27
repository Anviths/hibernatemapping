package edu.ty.fuelstation.view;

import edu.ty.fuelstation.controller.DAO;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DAO dao=new DAO();
//		dao.addVehicle();
		dao.updateMilageById(10, 25);
	}

}
