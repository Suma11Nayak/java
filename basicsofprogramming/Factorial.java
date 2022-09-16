package basicsofprogramming;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,fact=1;
		int num=4;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		
		}
		System.out.println("Factorial of "+num+" is:"+fact);
	}
	

	}


