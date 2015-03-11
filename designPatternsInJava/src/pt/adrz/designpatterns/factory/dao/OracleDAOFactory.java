package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.Account;
import pt.adrz.designpatterns.factory.dao.interfaces.Customer;
import pt.adrz.designpatterns.factory.dao.interfaces.Order;

public class OracleDAOFactory extends DAOFactory {
	
	public OracleDAOFactory() { }

	@Override
	public Customer getCustomerDAO() {
		return null;
	}

	@Override
	public Account getAccountDAO() {
		return new OracleAccountDAO();
	}

	@Override
	public Order getOrderDAO() {
		return null;
	}
}
