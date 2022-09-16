package training2;

public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Mul m1=new Mul();
		m1.mul(10.2,20.23);
		m1.mul(5,10);
		m1.mul(5,10,15);
	}
      void mul(double x, double y) {
		double mul=x*y;
		System.out.println(mul);
		// TODO Auto-generated method stub
		
	}
	void mul(int x,int y)
	{
		int mul=x*y;
		System.out.println(mul);
	}
	
	
	void mul(int x,int y,int z)
	{
		int mul=x*y*z;
		System.out.println(mul);
	}

	}


