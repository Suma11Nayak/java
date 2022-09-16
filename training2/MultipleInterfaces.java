package training2;
interface inter1{
	void m1();
}
interface inter2 {
	void m2();
}
interface inter3{
	void m3();
}
public class MultipleInterfaces implements inter1,inter2,inter3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultipleInterfaces M1=new MultipleInterfaces();
M1.m1();
M1.m2();
M1.m3();
	}
	public void m1(){
		System.out.println("Welcome");
		
	}
    public void m2() {
	System.out.println("World");
	
}
    public void m3() {
    	System.out.println("hii");
}
}
