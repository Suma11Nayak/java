package training2;

public class MainOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default main");
		MainOverload m1=new MainOverload();
		m1.main();
		m1.main(10);
		
	}
	 void main() {
		System.out.println("hello");

	}
	 void main(int a) {
		System.out.println("hi");
	}

}
