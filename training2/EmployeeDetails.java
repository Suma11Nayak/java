package training2;


public class EmployeeDetails {
	String Name;
	static String CompanyName;
	int	id;
	int	sal;
	String job;

	public static void main(String[] args) {
		EmployeeDetails e1=new EmployeeDetails();
		e1.init("suma",123,100000,"Manager");
		e1.display();
		initstaticData();
		EmployeeDetails e2=new EmployeeDetails();
		e2.init("John",133,45000,"Tester");
		e2.display();
		
	}
	  private static void initstaticData() {
		  CompanyName="Tietoevry";
		// TODO Auto-generated method stub
		
	}
	  static {
		  System.out.println("-----EMPLOYEE DETAILS----");
	  }
	private void init(String Name_temp, int id_temp, int sal_temp, String job_temp) {
		// TODO Auto-generated method stub
		  Name=Name_temp;
		  id=id_temp;
		  sal=sal_temp;
		  job=job_temp;
		
	}
	void display() {
		System.out.println("CompanyName: "+CompanyName);
	    	System.out.println("Emp Name: " +Name);
	    	
	    	System.out.println("Emp id: " +id);
	    	
	    	System.out.println("Emp sal: " +sal);
	    	System.out.println("Emp Designation: " +job);
		// TODO Auto-generated method stub

	}
	
}
