package training2;
class Father{
	

void m1()
{
	System.out.println("Hello");
}
}

public class Child extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1.m1();
		c1.m2();

	}
	void m2()
	{
		System.out.println("World");
	}

}
