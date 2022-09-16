package training2;
class Login{

	

void VerifyLogin() {

{
	System.out.println("Login Details");
}
}
}

public class Beneficiary extends Login{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beneficiary B1=new Beneficiary();
		B1.VerifyLogin();
		B1.VerifyBeneficiary();

	}
	void  VerifyBeneficiary()
	{
		System.out.println("Beneficiary Details");
	}

}
