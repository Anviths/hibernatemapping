package edu.ty.doctor.view;

import edu.ty.doctor.controller.DAO;

public class View {

	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.addDoctor();
//		dao.findDoctorById(1);
		
	}

}
