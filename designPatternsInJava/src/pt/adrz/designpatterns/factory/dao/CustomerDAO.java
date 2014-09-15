package pt.adrz.designpatterns.factory.dao;

public interface CustomerDAO {
	
	public int insertCustomer();
	public boolean deleteCustomer();
	public Customer findCustomer();
	public Customer updateCustomer();
}
