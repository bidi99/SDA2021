package ex3;

public class Main {
 
	public static void main (String[]args) {
		Address address = new Address ("Brasov","Zizinului",57);
	    PaymentMethod pm = new PaymentMethod("card");
	    Customer c = new Customer (address, pm ,"Amariei","Rares",21);
	    
	    System.out.println(c.getCompleteName());
	    System.out.println(c.getAddress().getFullAddress());
	    System.out.println(c.getPaymentMethod().getType());
	}
}
