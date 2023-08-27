package edu.ty.employee.view;

import edu.ty.employee.controller.DAO;

public class View {

	public static void main(String[] args) {

		DAO dao=new DAO();
//		dao.createEmployee();
		dao.updateEmployeeNameById(101, "bheem");
	}

}
