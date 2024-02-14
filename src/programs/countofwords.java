package programs;

import java.util.Arrays;

public class countofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello I love Vaibhav";
		
		//separate s.split(" ");
		
		//Array
		String [] words = s.split(" ");
		
		System.out.println(words.length);
		System.out.println(Arrays.toString(words));

	}

}


