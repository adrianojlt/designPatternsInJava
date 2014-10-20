package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.AccountDAO;
import pt.adrz.designpatterns.factory.dao.interfaces.CustomerDAO;
import pt.adrz.designpatterns.factory.dao.interfaces.OrderDAO;

public class MySqlDAOFactory extends DAOFactory{
	
	private static final String CONTEXT = "java:/comp/env";
	private static final String DATASOURCE = "jdbc/gymlogger";
	private static final String DRIVER = "org.mysql.Driver";
	private static final String URL = "jdbc:mysql://localhost:5432/webservice";
	private static final String USER = "root";
	private static final String PASS = "";
	
	public MySqlDAOFactory() {
		
	}
	
	@Override
	public CustomerDAO getCustomerDAO() {
		return new MySqlCustomerDAO();
	}

	@Override
	public AccountDAO getAccountDAO() {
		return new MySqlAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		return null;
	}

}
