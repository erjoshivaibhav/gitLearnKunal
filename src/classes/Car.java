package classes;

public class Car {
	
	//Attributes
	int gear=4;
	String color="Grey";
	String type="CNG";
	
	/*How to write method definition
	 * accessModifier returnType nameOfMethod (){} 
	 * private/protected/public string/int/void ()
	 */
	//methods/functions
	
	//method1
	public void drive() {
		
		System.out.println("Car is driving");
	}
	
	//method2
	public void stop() {
		System.out.println("Car is stopped");

	}
	

	public static void main(String[] args) {
		
		//WE have to crate an object in order to access anything in class
		//classname refVariableName = new classname ()
		Car punch = new Car();  
		
		// you call a method by refVariableName.methodName()
		punch.drive(); 
		punch.stop();
		System.out.println(punch.color);

		System.out.println(punch.type);

		System.out.println(punch.gear);

	}

}


