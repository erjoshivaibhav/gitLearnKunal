package classes;

public class ReturnExample {
	
	public int sum(int a,int b)
	{
		int ans = a+b;
		return ans;
	}
	
	public float siCalc(int p,int r,int t)
	{
		return ((p*r*t)/100);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnExample r = new ReturnExample();
		float intrest = r.siCalc(10000, 8, 10);
		
		System.out.println(intrest);
		
		
		

	}

}
