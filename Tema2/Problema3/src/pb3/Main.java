package pb3;

public class Main {
	public static void main(String[] args) {
		Address address = new Address("Campulung Muscel" , "Oncesti" , 1);
		PaymentMethod pm = new PaymentMethod("cash");
		Customer c = new Customer(address,pm,"Bidilica","Ionut-Razvan",21);
		
		System.out.println(c.getCompleteName());
		System.out.println(c.getAddress().getFullAddress());
		System.out.println(c.getPaymentMethod().getMethod());
		
	}
}
