package pb3;

public class PaymentMethod {
	private String method;


	public PaymentMethod(String method) {
		this.method = method;
	}
	
	public String getMethod() {
		return ("Payment Method :" + method);
	}

}
