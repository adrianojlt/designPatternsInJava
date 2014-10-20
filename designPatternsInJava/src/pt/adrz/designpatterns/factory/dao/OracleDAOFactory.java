package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.AccountDAO;
import pt.adrz.designpatterns.factory.dao.interfaces.CustomerDAO;
import pt.adrz.designpatterns.factory.dao.interfaces.OrderDAO;

public class OracleDAOFactory extends DAOFactory {
	
	public OracleDAOFactory() { }

	@Override
	public CustomerDAO getCustomerDAO() {
		return null;
	}

	@Override
	public AccountDAO getAccountDAO() {
		return new OracleAccountDAO();
	}

	@Override
	public OrderDAO getOrderDAO() {
		return null;
	}
}
