package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.Account;

public class TestDriveFactoryDAO {
	
	public static void start() {
		
		DAOFactory factory;
		Account account;
		
		factory = DAOFactory.getDAOFactory(DAOFactory.STORAGE_TYPE.MYSQL);
		account = factory.getAccountDAO();
		account.insertAccount();
		
		factory = DAOFactory.getDAOFactory(DAOFactory.STORAGE_TYPE.ORACLE);
		account = factory.getAccountDAO();
		account.insertAccount();
		
		// or ...
		account = DAOFactory.getAccountDAO(DAOFactory.STORAGE_TYPE.ORACLE);
		account.updateAccount();
	}
	
	public static void main(String[] args) {
		start();
	}
}
