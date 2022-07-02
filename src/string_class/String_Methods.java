package string_class;

public class String_Methods 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="ABCD";
		String s3="";
		String s4="abcd";
		String s5 ="abcabcab";
		String s6="java class";
		
		System.out.println(s1.startsWith("ve"));
		System.out.println(s1.endsWith("y"));
		System.out.println("-----------------------");
		
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.lastIndexOf("t"));
		System.out.println("------------------------");
		
		System.out.println(s1.equals(s5));
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s1.contains("oc"));
		System.out.println("--------------");
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.isEmpty());
		System.out.println(s3.isEmpty());
		System.out.println("------------------------");
		
		System.out.println(s6.replace("java","selenium"));
		System.out.println(s2.concat(s4));
		System.out.println(s2+s4);
		System.out.println(s1.substring(1,3));
		System.out.println(s1.substring(6));
		System.out.println(s1.startsWith("ve"));
		System.out.println(s1.endsWith("fg"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
