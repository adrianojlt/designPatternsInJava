package pt.adrz.designpatterns.factory.dao;

public interface AccountDAO {
	
	public int insertAccount();
	public boolean deleteAccount();
	public Customer findAccount();
	public Customer updateAccount();
}
