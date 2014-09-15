package pt.adrz.designpatterns.factory.dao;

public abstract class DAOFactory {
	
	// DAO types supported by the factory
	public static final int MYSQL = 1;
	public static final int ORACLE = 2;
	public static final int MSSQL = 3;
	
	public abstract CustomerDAO getCustomerDAO();
	public abstract AccountDAO getAccountDAO();
	public abstract OrderDAO getOrderDAO();
	
	public static DAOFactory getDAOFactory( int whichFactory) {
		
		switch (whichFactory) {
		case MYSQL:
			return new MySqlDAOFactory();
		case ORACLE:
			return null;
		case MSSQL:
			return null;
		default:
			return null;
		}
	}
}
