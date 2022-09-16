package basicsofprogramming;

public class Recursion {
	static int  i=0;
	static void p() {
		i++;
		if(i<4) {
			System.out.println("hello");
			p();
		}
		
	}
	public static void main(String[]args) {
		p();
	}
}

		// TODO Auto-generated method stub

	


