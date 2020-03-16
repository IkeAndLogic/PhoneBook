/*
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PhoneBook ph = new PhoneBook();
		//Person [] persons = ph.searchFirstName("John");
		Person [] persons = ph.searchPerson("John", 1);

		
		//System.out.println(ph.searchFirstName("John"));
		
		
		for(Person person : persons) {
			
			System.out.println(person.firstName + " "+ person.lastName);
		}
		
		
		
		String firstName= "";
		
		String lastName = " ";
		String middleName = "";
		
		String word= "John Smith Green Doe ";
		
		String [] fullName = word.split(" " );
		
		
		if(fullName.length > 2) {
			
			
			int i = 0;
			
			firstName = fullName[i];
			
			for(i= 1; i<fullName.length-1; i++) {
				middleName = middleName +" "+fullName[i];	
			}
			
			
			lastName = fullName[fullName.length -1];

			
			
		}
		else {
			firstName = fullName[0];
			lastName = fullName[1];
		}
	
		
		
		
		System.out.println(firstName);
		

		System.out.println(middleName.trim());
		
		
		System.out.println(lastName);


		
	}

}


*/