package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.AccountDAO;

public class TestDriveFactoryDAO {
	
	public static void start() {
		
		DAOFactory factory = DAOFactory.getDAOFactory(DAOFactory.STORAGE_TYPE.MYSQL);
		AccountDAO account = factory.getAccountDAO();
		account.insertAccount();
		
		factory = DAOFactory.getDAOFactory(DAOFactory.STORAGE_TYPE.ORACLE);
		account = factory.getAccountDAO();
		account.insertAccount();
	}
}
