package JavaBasics;

public class debugmode {
	
	public static void main(String[] args) {
		
		for (int i=0; i>5; i++ ) {  //wherever logic will be there debug will apply
			System.out.println(i);  // click on step over
			System.out.println("Hello");  //to come out of debug-window-perspective-close perspective
		}
		
		for(int i=1; i<=10; i++) {
			if (i<10) {
				System.out.print(i+",");
			}
			else {
				System.out.println(i);
			}
			
		}
		//1,2,3,4,5,6,7,8,9,10, remove last comma
		
		
		
	}

}
