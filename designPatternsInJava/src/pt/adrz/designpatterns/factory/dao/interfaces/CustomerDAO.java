package pt.adrz.designpatterns.factory.dao.interfaces;

import pt.adrz.designpatterns.factory.dao.models.Customer;

public interface CustomerDAO {
	
	public int insertCustomer();
	public boolean deleteCustomer();
	public Customer findCustomer();
	public Customer updateCustomer();
}
