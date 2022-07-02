package constructor;

public class sample4 
{
	int c;    //25
	int d;    //5
	
	
	//step2: initialization
	//use1: to initialize global variable
	//use2: to copy all the members of class into object
	sample4()
	{
		c=25;
		d=5;
	}
	
	
	public void sub() 
	{
		System.out.println(c-d);   //25-5 =20
	}
	
}
