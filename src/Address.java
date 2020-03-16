
public class Address {

	
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	
	
	
	
	public Address() {
		
	}


public Address(String streetAddress, String city, String state, String zipCode) {
	
	this.streetAddress = streetAddress;
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
		
	}

	
public void setStreet(String streetAddress) {
	
	this.streetAddress = streetAddress;
}

public void setCity(String city) {
	
	this.city = city;
}

public void setState(String state) {
	
	this.state = state;
}

public void setZipCode(String zipCode) {
	
	this.zipCode = zipCode;
}



public String getZipCode() {
	
	return this.zipCode;
}


public String getState() {
	
	return this.state;
}

public String getCity() {
	
	return this.city;
}


public String getStreetAddress() {
	
	return this.streetAddress;
}








}
