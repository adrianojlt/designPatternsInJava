package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.Account;

public class TestDriveFactoryDAO {
	
	public static void start() {
		
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.STORAGE_TYPE.MYSQL);
		Account account = factory.getAccountDAO();
		account.insertAccount();
		
		account = DAOFactory.getDAOFactory(DAOFactory.STORAGE_TYPE.ORACLE).getAccountDAO();
		account.insertAccount();
		
		// or ...
		account = DAOFactory.getAccountDAO(DAOFactory.STORAGE_TYPE.ORACLE);
	}
}
