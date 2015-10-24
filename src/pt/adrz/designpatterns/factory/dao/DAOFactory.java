package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.Account;
import pt.adrz.designpatterns.factory.dao.interfaces.Customer;
import pt.adrz.designpatterns.factory.dao.interfaces.Order;

public abstract class DAOFactory {
	
	enum STORAGE_TYPE {MYSQL,ORACLE,MSSQL,DB4O}
	
	public abstract Customer getCustomerDAO();
	public abstract Account getAccountDAO();
	public abstract Order getOrderDAO();
	
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
	
	public static Customer getCustomerDAO( STORAGE_TYPE whichFactory ) {
		
		switch (whichFactory) {
			case MYSQL:
				return new MySqlCustomerDAO();
			case ORACLE:
				return null;
			case MSSQL:
				return null;
			case DB4O:
				return null;
			default:
				return null;
		}
	}
	
	public static Account getAccountDAO( STORAGE_TYPE whichFactory ) {
		
		switch (whichFactory) {
			case MYSQL:
				return new MySqlAccountDAO();
			case ORACLE:
				return new OracleAccountDAO();
			case MSSQL:
				return null;
			case DB4O:
				return null;
			default:
				return null;
		}
	}
}
