package training2;
class Animal{
	 

	void animals() {
		System.out.println("Talk about animals");
	}
	
}

public class MethodOverride extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverride m1=new MethodOverride();
         m1.animals();
        
	}
	void animals() {
		super.animals();
	  System.out.println("Dogs can walk and run");}

}
