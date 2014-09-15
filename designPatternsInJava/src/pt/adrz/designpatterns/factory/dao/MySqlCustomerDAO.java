package pt.adrz.designpatterns.factory.dao;

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
