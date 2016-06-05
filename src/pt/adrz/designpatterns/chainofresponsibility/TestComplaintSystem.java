package pt.adrz.designpatterns.chainofresponsibility;

/**
 *  Chain of Responsibility Pattern decouples the handler of a request from its sender by providing multiple 
 *  potential handlers chained in a sequence. As the request reaches the first handler object, 
 *  the object checks if it can handle this request. 
 *  If yes, it handles the request, else it forwards the request to the next handler object in the chain.
 * @author adriano
 */
public class TestComplaintSystem {
	
	public static void main(String args[]) {

		// hierarchy of staff is created
		ClassTeacher classTeacher = new ClassTeacher(new VicePrincipal(new Principal(null)));

		// 3 complaint requests are created and sent to class teacher
		classTeacher.handleComplaint(new ComplaintRequest(3, "A101"));
		classTeacher.handleComplaint(new ComplaintRequest(7, "B202"));
		classTeacher.handleComplaint(new ComplaintRequest(10, "C303"));
	}
}
