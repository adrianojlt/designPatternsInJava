package pt.adrz.designpatterns.chainofresponsibility;

public class VicePrincipal extends Staff {
	
	public VicePrincipal(Staff successor) {
		super(successor);
	}

	@Override
	public void handleComplaint(ComplaintRequest complaintRequest) {

		if (complaintRequest.getPastComplaintCount() <= 9) {
			System.out
				.println("VicePrincipal handled the complaint for roll no:" + complaintRequest.getStudentRollNo());
		} else {
			successor.handleComplaint(complaintRequest);
		}
	}
}
