package string_class;

public class String_Pool_area 
{
	public static void main(String[] args) 
	{
		//Object creation of string 
		
				//1. without new keyword
				String s1="abc";
				String s2="abc";
				String s3="abc1";
					
				//2. using new keyword
				String s4=new String("abc");
				String s5 =new String("abc");
				String s6 =new String("abc1");
				
				
				System.out.println(s1==s2);      //true
				System.out.println(s1==s3);      //false
				System.out.println(s1==s4);    // false
				System.out.println(s4==s5);    //false
				
				System.out.println(s4.equals(s5)); //true
			
	}
}
