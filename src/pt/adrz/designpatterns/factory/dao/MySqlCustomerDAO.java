package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.Customer;

public class MySqlCustomerDAO implements Customer {

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
