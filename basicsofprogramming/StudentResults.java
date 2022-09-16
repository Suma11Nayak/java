package basicsofprogramming;

public class StudentResults {

	public static void main(String[] args) {
		int marks=100;
		if(marks>35 && marks<49)
			{
			System.out.println("Student passed");
			}
		else if(marks>=50 && marks<90) {
			System.out.println("Student secured second class");
		}
		else if(marks>=90 && marks>100) {
			System.out.println("Student secured first class");
		}
		else if(marks==100) {
			System.out.println("Student secured first Rank ");
		}
		
		else {
			System.out.println("Student failed");
			
		}
		}
			
			
			
		
	}


	

