package basicsofprogramming;

public class Prime {

	public static void main(String[] args) {
		int num=6;
		boolean f=false;
		for(int i=2;i<=num;++i)
		{
			if(num%i==0)
				f=true;
			break;
		}
	
	
	if(!f)
	
		System.out.println(num + " is prime");
		else
			System.out.println(num +" is not a prime");
}
}
			
		
		// TODO Auto-generated method stub

	


