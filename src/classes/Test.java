package classes;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner SC = new Scanner(System.in);
		Calculator s = new Calculator();
		System.out.println("Please enter two values to Add");

		float value1 = SC.nextFloat();
		float value2 = SC.nextFloat();

		float sumResult = s.sum(value1, value2);

		System.out.println(sumResult);

		System.out.println("Please enter two values to Subtract");

		float value3 = SC.nextFloat();
		float value4 = SC.nextFloat();

		float minusResult = s.minus(value3, value4);

		System.out.println(minusResult);
		
		System.out.println("Please enter two values to Divide");

		float value5 = SC.nextFloat();
		float value6 = SC.nextFloat();

		float divideResult = s.divide(value5, value6);
		if(divideResult !=0) {
			System.out.println(divideResult);
		}

		System.out.println("Please enter two values to Divide");

		float value7 = SC.nextFloat();
		float value8 = SC.nextFloat();

		float multiplyResult = s.multiply(value7, value8);
		if(divideResult !=0) {
			System.out.println(multiplyResult);
		}

		

	}

}
