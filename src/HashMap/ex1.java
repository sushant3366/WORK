package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 
{
	public static void main(String[] args)
	{
		HashMap<String, String> capital = new HashMap<String,String>();
//		Map<String, String> capital = new HashMap<String,String>();  also works as map is interface
		
		capital.put("India", "Delhi");
		capital.put("USA", "Washington DC");
		capital.put("China", "Beiging");
		
		System.out.println(capital);
		System.out.println("--------------------------");
		
		System.out.println(capital.get("India"));
		System.out.println("--------------------------");

		System.out.println(capital.size());
		System.out.println("--------------------------");
		
		for (String i : capital.keySet())
		{
			System.out.println(i);
		}
		System.out.println("--------------------------");

		for (String i : capital.values()) 
		{
		      System.out.println(i);
		}
		System.out.println("--------------------------");
		for(String i:capital.keySet())
		{
			System.out.println(i+" : "+capital.get(i));
		}
		System.out.println("--------------------------");
		for(Entry<String, String> data:capital.entrySet())
		{
			System.out.println(data.getKey()+" : "+data.getValue());
		}
		
}
}