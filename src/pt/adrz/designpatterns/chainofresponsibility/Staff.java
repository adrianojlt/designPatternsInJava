package pt.adrz.designpatterns.chainofresponsibility;

public abstract class Staff {
	
	protected Staff successor = null;

	public Staff(Staff successor) {
		super();
		this.successor = successor;
	}

	public abstract void handleComplaint(ComplaintRequest complaintRequest);
}
