package pb3;

public class Address {
	private String city, street;
	private int number;

	public Address(String city, String street, int number) {
		this.city = city;
		this.street = street;
		this.number = number;
	}

	public String getCity() {
		return city;
	}


	public String getStreet() {
		return street;
	}


	public int getNumber() {
		return number;
	}

	
	public String getFullAddress() {
		return ("City :" + getCity() + " ," +"street :" +getStreet()+" ,"+"nr. :" +getNumber());
	}
	
}
