package edu.ty.bankaccount.view;

import edu.ty.bankaccount.controller.DAO;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
//		dao.createBankAccount();
		dao.updateAccountNumberById(101, "78520002522");
	}

}
