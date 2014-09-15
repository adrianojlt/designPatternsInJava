package pt.adrz.designpatterns.factory.dao;

public interface OrderDAO {
	
	public int insertOrder();
	public boolean deleteOrder();
	public Customer findOrder();
	public Customer updateOrder();
}
