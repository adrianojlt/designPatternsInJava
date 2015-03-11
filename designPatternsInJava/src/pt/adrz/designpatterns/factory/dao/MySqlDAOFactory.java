package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.Account;
import pt.adrz.designpatterns.factory.dao.interfaces.Customer;
import pt.adrz.designpatterns.factory.dao.interfaces.Order;

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
	public Customer getCustomerDAO() {
		return new MySqlCustomerDAO();
	}

	@Override
	public Account getAccountDAO() {
		return new MySqlAccountDAO();
	}

	@Override
	public Order getOrderDAO() {
		return null;
	}

}
