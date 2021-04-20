package pb3;

public class Customer {
	private Address address;
	private PaymentMethod paymentMethod;
	private String firstName , lastName;
	private int age;
	
	public Customer(Address address ,PaymentMethod paymentMethod,String firstName,String lastName ,int age) {
		this.address = address;
		this.paymentMethod =paymentMethod;
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
		return ("Name :" + firstName + " " + lastName + "\nAge :" +age);
	}
}
