package edu.ty.car.view;

import edu.ty.car.contrloller.DAO;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
//		dao.addCar();
		dao.updateCarPriceById(1, 2500000);
	}

}
