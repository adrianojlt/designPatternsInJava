package pt.adrz.designpatterns.factory.dao.interfaces;

import pt.adrz.designpatterns.factory.dao.models.Customer;

public interface Order {
	
	public int insertOrder();
	public boolean deleteOrder();
	public Customer findOrder();
	public Customer updateOrder();
}
