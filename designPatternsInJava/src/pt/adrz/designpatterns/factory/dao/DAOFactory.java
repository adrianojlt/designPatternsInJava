package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.AccountDAO;
import pt.adrz.designpatterns.factory.dao.interfaces.CustomerDAO;
import pt.adrz.designpatterns.factory.dao.interfaces.OrderDAO;

public abstract class DAOFactory {
	
	enum STORAGE_TYPE {MYSQL,ORACLE,MSSQL,DB4O}
	
	public abstract CustomerDAO getCustomerDAO();
	public abstract AccountDAO getAccountDAO();
	public abstract OrderDAO getOrderDAO();
	
	public static DAOFactory getDAOFactory( STORAGE_TYPE whichFactory) {
		
		switch (whichFactory) {
		case MYSQL:
			return new MySqlDAOFactory();
		case ORACLE:
			return new OracleDAOFactory();
		case MSSQL:
			return null;
		case DB4O:
			return null;
		default:
			return null;
		}
	}
}
