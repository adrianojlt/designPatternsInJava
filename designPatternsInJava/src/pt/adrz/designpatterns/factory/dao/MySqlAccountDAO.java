package pt.adrz.designpatterns.factory.dao;

public class MySqlAccountDAO implements AccountDAO {

	@Override
	public int insertAccount() {
		return 0;
	}

	@Override
	public boolean deleteAccount() {
		return false;
	}

	@Override
	public Customer findAccount() {
		return null;
	}

	@Override
	public Customer updateAccount() {
		return null;
	}

}
