package arrays;

import java.util.Arrays;

public class singleDimenstionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Array- we can store multiple values in a single variables of same
		//Syntax
		//datatypes [] variablename={values1,values2};
		
		int a[]= {10,20,30,40,50};
		
		System.out.println(a.length);
		
		//access specific values from array
		System.out.println(a[2]);
		
		
		//to print array in java
		System.out.println(Arrays.toString(a));
		
		//update the value in array
		
		a[3]=70;
		System.out.println(Arrays.toString(a));
		
		//2nd way to print
		for(int i= 0;i<a.length;i++) {
			System.out.print(a[i]+" ");	
		}
		
		System.out.println();
		//3rd way
		for(int k: a) {
			System.out.print(k+" ");
		}

	}

}
