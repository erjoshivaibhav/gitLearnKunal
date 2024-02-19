package classes;

public class Students {
	
	int rollnum;
	String name;
	int std;
	String classteachername;
	static String school = "KV" ;
	
	public void study() {
		System.out.println("Student is studying");
		
	}
	
	public void play() {
		System.out.println("Student is playing");
	}
	
	public void exam() {
		System.out.println("Student is giving exam");
	}
	
	public void showTeacherName() {
		// TODO Auto-generated method stub
		System.out.println("CT is :"+classteachername);

		
	}

	public void showStd() {
		// TODO Auto-generated method stub
		System.out.println("Std is :"+std);
		
	}

	private void showName() {
		// TODO Auto-generated method stub
		System.out.println("Name is :"+name);

		
	}

	public void showRollNum() {
		// TODO Auto-generated method stub
		System.out.println("Roll num is :"+rollnum);

		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1 = new Students();
		
		s1.rollnum=1;
		s1.name="Vaibhav Joshi";
		s1.std=12;
		s1.classteachername="Sonali Menaria";
		
		s1.study();
		s1.play();
		s1.exam();
		s1.showRollNum();
		s1.showName();
		s1.showStd();
		s1.showTeacherName();
		
		Students s2= new Students();
		s2.classteachername = "Prateek";
		s2.name = "Sona";
		s2.rollnum = 2;
		s2.std = 12;
		
		
		s2.showRollNum();
		s2.showName();
		s2.showStd();
		s2.showTeacherName();
		
		System.out.println(Students.school);
		
		
		
		
		
		
		
	}

	
}
