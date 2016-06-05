package pt.adrz.designpatterns.chainofresponsibility;

public class ComplaintRequest {
	
	private int		pastComplaintCount;
	private String	studentRollNo;

	public ComplaintRequest(int pastComplaintCount, String studentRollNo) {
		super();
		this.pastComplaintCount = pastComplaintCount;
		this.studentRollNo = studentRollNo;
	}

	public int getPastComplaintCount() {
		return pastComplaintCount;
	}

	public void setPastComplaintCount(int pastComplaintCount) {
		this.pastComplaintCount = pastComplaintCount;
	}

	public String getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
}
