package training2;
class A{
	private int i=20;
	public void data(){
		System.out.println("hello");
		A a1=new A();
		System.out.println(i);
		
	}
	
}
		

public class SimplePriv {

	public static void main(String[] args) {
	A a1=new A();
a1.data();//compile time error
		// TODO Auto-generated method stub

	}
}


