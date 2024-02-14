package JavaBasics.patterns;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// method 1
//		for (int i=1;i<=5;i++) {
//			for (int j=1;j<=4-i;j++) {
//				System.out.print(" ");
//			}
//			
//			for (int k=1;k<=i;k++) {
//				System.out.print("*"+" ");
//			}
//			
//			System.out.println();
//		}

// method 2
	    for(int i=0;i<=4;i++){
	        
	        for(int j=4-i;j>1;j--){
	            System.out.print(" ");
	        }
	        
	        for(int j=0;j<=i;j++){
	            
	            System.out.print("*"+" ");
	        }
	        System.out.println("");
	    }

		
	}

}
