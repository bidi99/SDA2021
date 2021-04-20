package ex3;

public class Customer {
 

	private Address address;
	private PaymentMethod paymentMethod ;
	private String firstName;
	private String lastName;
	private int age ;
	
	public Customer(Address adress ,PaymentMethod pm ,String firstName ,String lastName , int age) {
		this.address=adress;
		this.paymentMethod=pm;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}

	public Address getAddress() {
		return address;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	public String getCompleteName() {
		return "Nume complet:" + firstName +" " +lastName+ "\nVarsta:"+age  ;
}
}