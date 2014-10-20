package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.CustomerDAO;
import pt.adrz.designpatterns.factory.dao.models.Customer;

public class MySqlCustomerDAO implements CustomerDAO {

	@Override
	public int insertCustomer() {
		return 0;
	}

	@Override
	public boolean deleteCustomer() {
		return false;
	}

	@Override
	public Customer findCustomer() {
		return null;
	}

	@Override
	public Customer updateCustomer() {
		return null;
	}
}
