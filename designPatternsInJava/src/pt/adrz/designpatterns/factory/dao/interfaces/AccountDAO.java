package pt.adrz.designpatterns.factory.dao.interfaces;

import pt.adrz.designpatterns.factory.dao.models.Customer;

public interface AccountDAO {
	
	public int insertAccount();
	public boolean deleteAccount();
	public Customer findAccount();
	public Customer updateAccount();
}
