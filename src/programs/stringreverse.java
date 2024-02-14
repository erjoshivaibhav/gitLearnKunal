package programs;

public class stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String v= "Prathmesh";
		String rev="";
		
		
		for (int i=v.length()-4; i>=2; i--) {
			rev=rev+v.charAt(i);
			
		}
		System.out.println(rev);
	}
}
