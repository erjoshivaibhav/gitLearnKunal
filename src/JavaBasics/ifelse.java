package JavaBasics;

public class ifelse {
	
	public static void main(String[] args) {
		
		int studentsmarks=30;
		
		if (studentsmarks>90) {
			
			System.out.println("Distinction");
		
			
		}
			else if (studentsmarks>=70 && studentsmarks<=90) {
				
				System.out.println("First Class");
			}
		
         else if (studentsmarks>=50 && studentsmarks<70) {
				
				System.out.println("Second Class");
				
			}
         
         else {
				
				System.out.println("Fail");
			}
		
		
		
		}
	}
