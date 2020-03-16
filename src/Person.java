
public class Person {

	private String firstName;	
	
	private String middleName;	

	private String lastName;
	
	private String fullName;
	
	
	private String phoneNumber;
	private Address address;	
	
	
	public Person() {
		
	}
	
	public Person(String firstName,String middleName, String lastName, String phoneNumber, Address address) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber= phoneNumber;
		this.address = address;
		
		this.fullName = firstName+ " "+ middleName+ " "+ lastName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		this.fullName = firstName+ " "+ this.middleName+ " "+ this.lastName;

	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
		this.fullName = this.firstName+ " "+ middleName+ " "+ this.lastName;

	}
	
	public String getMiddleName() {
		return this.middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
		this.fullName = this.firstName+ " "+ this.middleName+ " "+ lastName;

	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return this.address;
	}

	public Person(String userInput) {
		
		
		String [] personString = userInput.split(",");
		
		String [] fullNameArray = personString[0].split(" ");
		this.middleName ="";
		if(fullNameArray.length>2) {
		for(int i =1; i<fullNameArray.length-1; i++) {
			
			
			this.middleName = middleName +" "+ fullNameArray[i];
			
			this.middleName = middleName.trim();
		}
		
		}
		
		this.firstName = fullNameArray[0];
		this.lastName = fullNameArray[fullNameArray.length-1];
		this.phoneNumber = personString[5].trim();

		 this.fullName = this.firstName + " "+ this.middleName+ " "+this.lastName;
		String streetAddress = personString[1].trim();
		String city = personString[2].trim();
		String state = personString[3].trim();
		String zipcode = personString[4].trim();
		
		 Address address = new Address(streetAddress, city,state, zipcode);
		 
		 this.address = address;	
	}
	
	@Override
	public String toString() {
		/*return "Person [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
				*/
		
		return "First Name: "+this.firstName + "  Middle Name: "+ this.middleName+ "  Last Name: "+ this.lastName+ 
		
		"\n" + "Phone Number : "+ this.phoneNumber + "\n"+ "Street: "+ this.address.getStreetAddress()
		+"\nCity: "+ this.address.getCity()+ "\nState: "+ this.address.getState()+ "\nZipcode: "+ this.address.getZipCode()+"\n";
	}
	

}
