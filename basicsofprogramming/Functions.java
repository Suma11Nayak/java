package basicsofprogramming;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Functions obj=new Functions();
    obj.add(10,20);
    
    obj.sub(30,20);
     obj.mul(5,6);
    obj.div(8,4);
    }
	void add(int a,int b)

	{
	  int sum=a+b;
		System.out.println(sum);
		}
	void  sub(int a,int b) {
		int sub=a-b;
		System.out.println(sub);
		
	}
	void  mul(int a,int b) {
		int mul=a*b;
		System.out.println(mul);
	}
	void  div(int a,int b) {
		int div=a/b;
		System.out.println(div);
	
	
	
	
	

	}
}

