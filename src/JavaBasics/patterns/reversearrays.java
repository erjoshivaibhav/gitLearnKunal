package JavaBasics.patterns;

import java.util.Arrays;

public class reversearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse the words
		String m="You are my World";
		//create an Array
		String [] words = m.split(" "); //You, are, my, World
		//define empty string
		//m="";--this can also be included
		for (int i=words.length-1;i>=0;i--) {
		//	m=m+words[i]+" ";--this can also be included
			System.out.print(words[i]+" ");
		}
		//System.out.println(m); //World my are You 
		
		//reverse the sentence
		String s="My name is Vaibhav";
	
		String v=""; //using the same variable (can be used without string)
		for(int i=s.length()-1;i>=0;i--) {
			v=v+s.charAt(i);
		}
		System.out.print(v); 

	}

}


// 