package JavaBasics;

public class Switch {
	
	public static void main(String[] args) {
		
		
		int day = 1; //defining the variable & providing value
		switch(day) {
		
		//to use the variable which needs to be checked
		
		case 1:
		    System.out.println("Monday");
		    break;
		
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		default:
			System.out.println("Invalid input");
		}


	// can be used for gender, months, year, categories..

	//to check the different types of datatypes
		
	//only int, String & enum are allowed in switch case
	
/*		float day1 = 1.1f; //defining the variable & providing value
		switch(day1) {
		
		//to use the variable which needs to be checked
		
		case 1.1:
		    System.out.println("ABC");
		    break;
		
		case 1.2:
			System.out.println("BCD");
			break;
			
		case 1.3:
			System.out.println("DEF");
			break;
			
		case 1.4:
			System.out.println("EFG");
			break;
			
		default:
			System.out.println("Invalid input");
		}
	} */

	String gender="trans";
	switch(gender) {
		
	case "male":
		System.out.println("This is male");
		break;
		
	case "female":
		System.out.println("This is female");
		break;
		
	default:
		System.out.println("Not willing to disclose");
		
	}
	
	String vowles="g";
	switch(vowles) {
		
	case "a","e","i","o","u":
		System.out.println("This is vowle");
		break;
		
	default:
		System.out.println("This is not a vowle");
		
	}
	
	
	}	
}




