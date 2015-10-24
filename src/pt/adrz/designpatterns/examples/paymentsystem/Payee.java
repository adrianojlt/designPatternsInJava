package pt.adrz.designpatterns.examples.paymentsystem;

public interface Payee {
	String name();
	Double grossPayment();
	Integer bankAccount();
}
