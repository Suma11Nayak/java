package training2;
class Banking{
	void B1() {
		System.out.println("Bank Details");
		
		
	}
}
class Withdrawal extends Banking{
	
	
	protected void w1() {
		System.out.println("Withdrawal Details");
	}
}
	


public class TransferFunds extends Withdrawal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 TransferFunds f1=new TransferFunds();
 
 f1.B1();
 f1.w1();
 System.out.println("Transaction Details");
 
 
 
	}
	
		// TODO Auto-generated method stub
		
	}



