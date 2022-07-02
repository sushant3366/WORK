package string_class;

public class Immutable 
{
	public static void main(String[] args) 
	{
		String a="hello";  //string literal -Immutable
		String b="hello";
		a.concat("world");
		System.out.println(a);
		
		
		//String Buffer and String Builder -Mutable
		StringBuffer s=new StringBuffer("hello");
		s.append("world");
		System.out.println(s);
		
		System.out.println(s.reverse());
	}
}
