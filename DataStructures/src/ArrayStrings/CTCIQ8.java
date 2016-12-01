package ArrayStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CTCIQ8 {
	
	public static boolean isCombination(String sent1,String sent2)
	{
		boolean f;
		HashMap<Character, Integer> count = new HashMap<>();
		for(int i=0;i<sent1.length();i++)
		{
			if(count.containsKey(sent1.charAt(i)))
			{
				int cnt = count.get(sent1.charAt(i));
				cnt++;
				count.replace(sent1.charAt(i), cnt);
			}
			else
				count.put(sent1.charAt(i), 1);
		}
		for(int i=0;i<sent2.length();i++)
		{
			if(count.containsKey(sent2.charAt(i)) && count.get(sent2.charAt(i))>0)
			{
				int cnt = count.get(sent2.charAt(i));
				cnt--;
				count.replace(sent2.charAt(i), cnt);
			}
			else
				return false;
		}
		Iterator itr = count.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>) itr.next();
			if(pair.getValue()!=0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String sent1 = sc.nextLine();
		String sent2 = sc.nextLine();
		if(isCombination(sent1,sent2))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	
}
