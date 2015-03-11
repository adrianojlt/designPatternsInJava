package pt.adrz.designpatterns.factory.dao.interfaces;


public interface Customer {
	
	public int insertCustomer();
	public boolean deleteCustomer();
	public Customer findCustomer();
	public Customer updateCustomer();
}
