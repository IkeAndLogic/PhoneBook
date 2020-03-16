import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {

	
	static Scanner scanner = new Scanner(System.in);

	static String  userInput = "";
	//static Address [] address = {};
	
	static Person[] persons = new Person[0];
	
	
	public static Person createPerson() {
		System.out.println("Enter First Name: ");
		String firstName=  scanner.nextLine();
		
		System.out.println("Enter middle Name: ");
		
		String middleName=  scanner.nextLine();

		
		System.out.println("Enter Last Name: ");
		String lastName=  scanner.nextLine();

		
		System.out.println("Enter PhoneNumber: ");
		
		String phoneNumber=  scanner.nextLine();

		System.out.println("Enter Street : ");
		
		String streetName=  scanner.nextLine();

		
		System.out.println("Enter city : ");
		
		String city=  scanner.nextLine();

		
		System.out.println("Enter state : ");
		
		String state=  scanner.nextLine();

		
		System.out.println("Enter zipCode : ");

		String zipCode=  scanner.nextLine();


		Address address = new Address(streetName, city, state, zipCode);
		
		Person newPerson = new Person(firstName,middleName,lastName,phoneNumber,address);
		
		return newPerson;
	}
	
	
	
	public static Person createPersonWithString() {
		System.out.println("Enter Full Details: ");
		String userInput=  scanner.nextLine();
		Person newPerson = new Person(userInput);
		
		return newPerson;
	}
	
	
	
	public static void deleteEntry(Person [] personsArray, Person personToDelete) {
		
		if (!(personsArray.length >=1)) {
			persons = new Person[1];
			System.out.println("Nothing to Delete");
		}
		else {
		persons = new Person [personsArray.length - 1];
		
		for(int i = 0; i<personsArray.length; i++) {
			
			if(!(personsArray[i].equals(personToDelete))){
					persons[i] = personsArray[i];
			}			
			
					
		}
		}		
		}
		
		
		
		public static void updateEntry(Person [] personsArray, Person personToUpdate, String phoneNumberSearched) {
			
			/*
			if (!(personsArray.length >=1)) {
				persons = new Person[1];
				System.out.println("Nothing to Update");
				
			}*/
			
			if(personToUpdate == null) {
				System.out.println("No record matches entry: "+ phoneNumberSearched);
			}
			else {
				
			//System.out.println("Found it: "+personsArray[0].getFirstName());	
			
			
			persons = new Person [personsArray.length - 1];
			
			Person p = createPerson();
			
			for(int i = 0; i<personsArray.length; i++) {
				
				if(personsArray[i].equals(personToUpdate)){
					
					personsArray[i] = p;
					
					//System.out.println("Say yes!!!");
					
				}
							
			}
			
			persons =personsArray;
			
			}
			
			
				
	}
	
	public static void addEntry(Person [] personsArray, Person person) {
		if (!(personsArray.length >=1)) {
			persons = new Person[1];
			
			persons[0] = person;
		}
		else {
		persons = new Person [personsArray.length +1];
		
		for(int p = 0; p<personsArray.length; p++) {
			
			persons[p] = personsArray[p];
					
		}
		
		persons[persons.length-1] = person;
		
		}
				
	}
	
	public static void displayAll() {
		
		if(!(persons.length >= 1)) {
			System.out.println("No person has been stored");
		}

		else {
		for(int i=0; i< persons.length; i++){
			System.out.println(persons[i]);
		}
		}
	}
	
	public static String [] sortArrary(String[] stringArray) {
		
		String temp = "";
		
		for(int i =0; i<stringArray.length-1; i++) {
			
			for(int j= 1; j<stringArray.length; j++) {
				if(stringArray[i].compareToIgnoreCase(stringArray[j])>0) {
					temp = stringArray[i];
					stringArray[i] = stringArray[j];
					stringArray[j] =temp;
					
				}
				
				
				
				
			}
		}
		
		return stringArray;
	}
	
	public static void displayAcendingOrder() {
		
		
		String [] ArrayOfPersonsStrings = new String[persons.length];
		
		
		if(!(persons.length >= 1)) {
			System.out.println("No person has been stored");
		}

		else {
		for(int i=0; i< persons.length; i++){
			
			if(persons[i].getMiddleName().equals("")) {
			ArrayOfPersonsStrings[i] = persons[i].getFirstName()+" "+ persons[i].getLastName()+","+ persons[i].getAddress().getStreetAddress()+
					","+ persons[i].getAddress().getCity()+","+ persons[i].getAddress().getCity()+
					","+ persons[i].getPhoneNumber();
			}
			else {
			ArrayOfPersonsStrings[i] = persons[i].getFirstName()+" "+persons[i].getMiddleName()+
					" "+ persons[i].getLastName()+","+ persons[i].getAddress().getStreetAddress()+
					","+ persons[i].getAddress().getCity()+","+ persons[i].getAddress().getCity()+
					","+ persons[i].getPhoneNumber();
			}
		}
		
		//Arrays.sort(ArrayOfPersonsStrings);
		
		
		ArrayOfPersonsStrings = sortArrary(ArrayOfPersonsStrings);
		
		
		
		for(int i =0; i <ArrayOfPersonsStrings.length; i++) {
			System.out.println(ArrayOfPersonsStrings[i]);
		}
		
		
		}
	}
	
	
	public static String askForSearch(int option) {
		
		if(option ==2) {
			System.out.println("Enter first Name: ");
			}
		else if(option ==3) {
			System.out.println("Enter last Name: ");
			}
		else if(option ==4) {
			System.out.println("Enter full Name: ");
			}
		else if(option == 5 || option == 8 || option == 9) {
			System.out.println("Enter telephone number: ");
			}
		else if(option ==6) {
			System.out.println("Enter city: ");
			}
		else if(option ==7) {
			System.out.println("Enter state: ");
			}
		return scanner.nextLine();
	}
	

	public static Person[] searchByfirstName(String input) {
		int count =0;
		

		for(int i= 0; i<persons.length; i++) {
				 
				if(persons[i].getFirstName().equalsIgnoreCase(input)) {
					count+=1;
				}					
		}
		
		Person [] personMatches = new Person[count];
		
		for(int i= 0; i<persons.length; i++) {
			if(persons[i].getFirstName().equalsIgnoreCase(input)) {
				personMatches[i] = persons[i];
				}
			}
		
		return personMatches;
		
		
	}
	
	
	public static Person [] searchByLastName(String input) {
		
		int count =0;
		for(int i= 0; i<persons.length; i++) {
				 
				if(persons[i].getLastName().equalsIgnoreCase(input)) {
					count+=1;
				}
				
		}
		Person [] personMatches = new Person[count];
		
		for(int i= 0; i<persons.length; i++) {
			if(persons[i].getLastName().equalsIgnoreCase(input)) {
				personMatches[i] = persons[i];
				}
			}
		
		return personMatches;
		
	}
	
	public static Person [] searchByPhone(String input) {
		int count =0;
		for(int i= 0; i<persons.length; i++) {
			if(persons[i].getPhoneNumber().equalsIgnoreCase(input)) {
					count+=1;
					}	
		}
		Person [] personMatches = new Person[count];
		
		for(int i= 0; i<persons.length; i++) {
			if(persons[i].getPhoneNumber().equalsIgnoreCase(input)) {
				personMatches[i] = persons[i];
				}
			}
		
		return personMatches;
		
	}
	
	
	public static Person FindPersonByPhoneNumber(String phoneNumber) {
		Person thePerson = new Person();
		
		for(int i= 0; i<persons.length; i++) {
			
		
			if(persons[i].getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
				
				thePerson = persons[i];
			}
			
			else {
				thePerson =null;
			}
			
		}
		
		return thePerson;
		
	}
	
	
	public static Person [] searchByCity(String input) {
		int count =0;
		for(int i= 0; i<persons.length; i++) {
			if(persons[i].getAddress().getCity().equalsIgnoreCase(input)) {
					count+=1;
					}	
		}
		Person [] personMatches = new Person[count];
		
		for(int i= 0; i<persons.length; i++) {
			if(persons[i].getAddress().getCity().equalsIgnoreCase(input)) {
				personMatches[i] = persons[i];
				}
			}
		
		return personMatches;
		
	}
	
	
	public static Person [] searchByState(String input) {
		int count =0;
		for(int i= 0; i<persons.length; i++) {
			if(persons[i].getAddress().getState().equalsIgnoreCase(input)) {
					count+=1;
					}	
		}
		Person [] personMatches = new Person[count];
		
		for(int i= 0; i<persons.length; i++) {
			if(persons[i].getAddress().getState().equalsIgnoreCase(input)) {
				personMatches[i] = persons[i];
				}
			}
		
		return personMatches;
		
	}
	
	
	public static Person [] searchByFullName(String input) {
		
		
		String [] stringToArray = input.split(" ");
		
		String userInputFullName = "";
		for(int k=0; k<stringToArray.length; k++) {
			userInputFullName = userInputFullName +" "+stringToArray[k];

		}
		
		userInputFullName = userInputFullName.trim();
		
		String fullName ="";
		
		
		int count =0;
		for(int i= 0; i<persons.length; i++) 
		{
			fullName = persons[i].getFirstName() +" "+ persons[i].getMiddleName()+" "+ persons[i].getLastName();
			
			if(userInputFullName.equalsIgnoreCase(fullName))
					{
					count+=1;
					}	
		}
		
		
		Person [] personMatches = new Person[count];
		
		for(int i= 0; i<persons.length; i++) {
			
			fullName = persons[i].getFirstName() +" "+ persons[i].getMiddleName()+" "+ persons[i].getLastName();

			if(fullName.equalsIgnoreCase(input)) {
				personMatches[i] = persons[i];
				}
			}
		
		return personMatches;
		
	}
	
	
	
	public static void beginMenu() {
		System.out.println("*****************************");
		System.out.println("Welcome To PhoneBook");
		System.out.println("******************************");

		System.out.println("[1] Add new entries");
		//System.out.println("[2] Search for an existing entry");
		System.out.println("[2] Search by first name");
		System.out.println("[3] Search by last name ");
		System.out.println("[4] Search by full name");
		System.out.println("[5] Search by telephone number");
		System.out.println("[6] Search by city");
		System.out.println("[7] Search by state");
		System.out.println("[8] Delete Record");
		System.out.println("[9] Update Record");
		System.out.println("[10] Show all by Records");
		System.out.println("[11] Exit");
		
		
		userInput = scanner.nextLine();
		
		Person [] allPersons = {};
		try {
		int desiredInt = Integer.parseInt(userInput);
		
		
		if(desiredInt ==1) {
		    
			//Person person =createPerson();
			
			Person person =createPersonWithString();

			addEntry(persons, person);
			
			beginMenu();
			}
		
		else if(desiredInt >=2 && desiredInt<=11) {
			
			if(desiredInt == 2) {
			String searchKey = askForSearch(desiredInt);
			allPersons = searchByfirstName(searchKey);
			
			if(!(allPersons.length >= 1)|| allPersons == null) {
				
				
				System.out.println("No First Name Matches the entry: "+ searchKey + "\n");
			}
			else {
			
						
			for(int i =0; i < allPersons.length; i++)
			{
				System.out.println(allPersons[i]);
			}
			
			beginMenu();
			}
			
			}
			if(desiredInt == 3) {
				
				String searchKey = askForSearch(desiredInt);
				
				allPersons = searchByLastName(searchKey);
				
				if(!(allPersons.length >= 1) || allPersons == null) {
					System.out.println("No Last Name Matches the entry: "+ searchKey + "\n");
				}
							
				for(int i =0; i < allPersons.length; i++)
				{
					System.out.println(allPersons[i]);
				}
				
				beginMenu();
				
			}
			
			if(desiredInt == 4) {
				
				String searchKey = askForSearch(desiredInt);
				
				allPersons = searchByFullName(searchKey);
				
				if(!(allPersons.length >= 1) || allPersons == null) {
					System.out.println("No full Name Matches the entry: "+ searchKey + "\n");
				}
							
				for(int i =0; i < allPersons.length; i++)
				{
					System.out.println(allPersons[i]);
				}
				
				beginMenu();
				
			}
			if(desiredInt == 5) {
				
				String searchKey = askForSearch(desiredInt);
				
				allPersons = searchByPhone(searchKey);
				
				if(!(allPersons.length >= 1) || allPersons == null) {
					System.out.println("No Phone Number Matches the entry: "+ searchKey + "\n");
				}
							
				for(int i =0; i < allPersons.length; i++)
				{
					System.out.println(allPersons[i]);
				}
				
				beginMenu();
				
			}
			if(desiredInt == 6) {
				
				String searchKey = askForSearch(desiredInt);
				
				allPersons = searchByCity(searchKey);
				
				if(!(allPersons.length >= 1) || allPersons == null) {
					System.out.println("No city matches the entry: "+ searchKey + "\n");
				}
							
				for(int i =0; i < allPersons.length; i++)
				{
					System.out.println(allPersons[i]);
				}
				
				beginMenu();
				
			}
			
			if(desiredInt == 7) {
				
				String searchKey = askForSearch(desiredInt);
				
				allPersons = searchByState(searchKey);
				
				if(!(allPersons.length >= 1) || allPersons == null) {
					System.out.println("No state matches the entry: "+ searchKey + "\n");
				}
							
				for(int i =0; i < allPersons.length; i++)
				{
					System.out.println(allPersons[i]);
				}
				
				beginMenu();
				
			}
			
			if(desiredInt == 8) {
				
				String searchKey = askForSearch(desiredInt);
				
				
				if(!(persons.length >= 1)) {
					System.out.println("No Phone Number matches the entry: "+ searchKey + "\n");
					beginMenu();
				}
				else {
				Person thePerson = FindPersonByPhoneNumber(searchKey);
				
				deleteEntry(persons, thePerson);
				
				beginMenu();
			}
				
			}
			if(desiredInt == 9) {
				
				String searchKey = askForSearch(desiredInt);
				
				
				if(!(persons.length >= 1)) {
					System.out.println("No Phone Number matches the entry: "+ searchKey + "\n");
					beginMenu();
				}
				else {
				Person thePerson = FindPersonByPhoneNumber(searchKey);
				
				//System.out.println(thePerson);
				updateEntry(persons, thePerson, searchKey);
				
				beginMenu();
			}
				
			}
			
				
			
			
		}
		
		
		if(desiredInt == 10) {			
			//displayAll();
			displayAcendingOrder();
			beginMenu();
			
		}
		if(desiredInt == 11) {			
			System.out.println("Good Bye!!!");
			
		}
		
		
		
		}
		catch(NumberFormatException ex) {
			
			beginMenu();

		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		beginMenu();
		
          

	}
	
	
	
	
	
}


