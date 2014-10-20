package pt.adrz.designpatterns.factory.dao;

import pt.adrz.designpatterns.factory.dao.interfaces.AccountDAO;
import pt.adrz.designpatterns.factory.dao.models.Customer;

public class OracleAccountDAO implements AccountDAO {

	public static String TYPE = "Oracle";

	@Override
	public int insertAccount() {
		System.out.println("insert account "+ TYPE +" implementation");
		return 0;
	}

	@Override
	public boolean deleteAccount() {
		System.out.println("delete account "+ TYPE +" implementation");
		return false;
	}

	@Override
	public Customer findAccount() {
		System.out.println("find account "+ TYPE +" implementation");
		return null;
	}

	@Override
	public Customer updateAccount() {
		System.out.println("update account "+ TYPE +" implementation");
		return null;
	}
}
