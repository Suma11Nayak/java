package training2;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y,z;
		Sum s1=new Sum();
		s1.add(10.2,20.23);
		s1.add(5, 10);
		s1.add(5,10,15);
	}
      void add(double x, double y) {
		double sum=x+y;
		System.out.println(sum);
		// TODO Auto-generated method stub
		
	}
	void add(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
	}
	
	
	void add(int x,int y,int z)
	{
		int sum=x+y+z;
		System.out.println(sum);
	}
	
	
	
		
		
		

	}


