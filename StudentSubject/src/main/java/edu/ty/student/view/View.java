package edu.ty.student.view;

import edu.ty.student.controller.DAO;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DAO dao=new DAO();
//dao.addSubject();
dao.updateStudentName(1, "raju");
	}

}
