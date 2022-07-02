package Generalization;

public class TestGeneralization 
{
	public static void main(String[] args)
	{
		System.out.println("----Feature of airtel----");
		airtel a1=new airtel();
		a1.newfeatureA();
		a1.sms();
		a1.calling();
		a1.internet();
		
		System.out.println("----Feature of bsnl----");
		bsnl b1=new bsnl();
		b1.newfeatureB();
		b1.sms();
		b1.calling();
		b1.internet();
		
		System.out.println("----Feature of jio----");
		jio j1=new jio();
		j1.newfeatureC();
		j1.sms();
		j1.calling();
		j1.internet();
	}
	
}
