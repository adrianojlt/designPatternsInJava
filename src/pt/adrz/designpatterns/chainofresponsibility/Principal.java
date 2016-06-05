package pt.adrz.designpatterns.chainofresponsibility;

public class Principal extends Staff {
	
	public Principal(Staff successor) {
		super(successor);
	}

	@Override
	public void handleComplaint(ComplaintRequest complaintRequest) {
		System.out.println("Principal handled the complaint for roll no:" + complaintRequest.getStudentRollNo());
	}
}
