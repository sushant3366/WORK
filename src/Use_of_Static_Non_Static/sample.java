package Use_of_Static_Non_Static;

public class sample 
{
	public static void main(String[] args)
	{
		
		Emp e1=new Emp();
		e1.empName = "rahul";
		e1.empID = 100;
		//e1.empCEOName = "abc";
		Emp.empCEOName="abc";
		
		Emp e2=new Emp();
		e2.empName="ganesh";
		e2.empID = 200;
		//e2.empCEOName = "abc";
		Emp.empCEOName = "abc";
		
		Emp e3= new Emp();
		e3.empName = "mahesh";
		e3.empID = 300;
		//e3.empCEOName = "xyz";
		Emp.empCEOName = "xyz";
		
		System.out.println("-----Emp1 info-----------");
		e1.empInfo();
				
		System.out.println("--------Emp2 info----------------");
		e2.empInfo();
				
		System.out.println("---------Emp3 info--------------");
		e3.empInfo();
		
	}

}
