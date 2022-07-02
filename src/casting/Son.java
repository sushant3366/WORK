package casting;

public class Son extends Father
{
	//child/ sub class

		
		public void mobile() 
		{
			System.out.println("mobile: samsung");
		}
		
		
		public void car()    //override
		{
			System.out.println("Car: BMW");
		}
		
		public void money()        //override
		{
			System.out.println("money: 3L");
		}
		
//		public void home()
//		{
//			System.out.println("Home: 2 BHK");
//		}	
}
