package casting;

public class TestCasting 
{
public static void main(String[] args) {
		
//		Son s=new Son();
//		s.mobile();
//		s.car();
//		s.money();
//		s.home();
//		
				
		//Create object of subclass with reference of super class
		
		Father	s=new Son();                 //upcasting
		s.car();
		s.money();
		s.home();
//		s.mobile();
		
}
}