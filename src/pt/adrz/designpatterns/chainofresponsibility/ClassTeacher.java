package pt.adrz.designpatterns.chainofresponsibility;

public class ClassTeacher extends Staff {

	public ClassTeacher(Staff successor) {
		super(successor);
	}

	@Override
	public void handleComplaint(ComplaintRequest complaintRequest) {

		if (complaintRequest.getPastComplaintCount() <= 4) {
			System.out.println("ClassTeacher handled the complaint for roll no:" + complaintRequest.getStudentRollNo());
		} else {
			successor.handleComplaint(complaintRequest);
		}
	}
}
