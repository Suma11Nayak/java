package training2;

public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y,z;
		Sub s1=new Sub();
		s1.sub(20.23,10.23);
		s1.sub(15, 10);
		s1.sub(5.0,2.5);
	}
      void sub(double x, double y) {
		double sub=x-y;
		System.out.println(sub);
		// TODO Auto-generated method stub
		
	}
	void add(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	
	
	void add(float x,float y)
	{
		float sub=x-y;
		System.out.println(sub);
	}
	

	}


