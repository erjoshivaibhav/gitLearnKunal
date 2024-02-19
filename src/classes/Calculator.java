package classes;



public class Calculator {
	
	public float sum (float a, float b)
	{
		float answer = a+b; 
		return answer;
	}
	
	public float multiply (float a, float b)
	{
		float answer = a*b; 
		return answer;
	}
	
	public float minus (float a, float b)
	{
		float answer = a-b; 
		return answer;
	}
	
	public float divide (float a, float b)
	{
		
		if (b==0) {
			
			System.out.println("You cannot divide by 0");
			return 0;
		}
		
		float answer = a/b; 
		return answer;
		
	}
	
	

}
