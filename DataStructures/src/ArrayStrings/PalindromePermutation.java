package ArrayStrings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;



public class PalindromePermutation {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String sent = sc.nextLine();
		
		if(isPalindrome(sent))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
	public static boolean isPalindrome(String sent)
	{
		boolean f;
		HashMap<Character, Integer> count = new HashMap<>();
		for(int i=0;i<sent.length();i++)
		{
			if(count.containsKey(sent.charAt(i)))
			{
				int cnt = count.get(sent.charAt(i));
				cnt++;
				count.replace(sent.charAt(i), cnt);
			}
			else
				count.put(sent.charAt(i), 1);
		}
		if(sent.length()%2==0)
		{
			f=true;
		}
		else
			f=false;
		Iterator itr = count.entrySet().iterator();
		boolean odd = false;
		while(itr.hasNext())
		{
			if(f)
			{
				Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>) itr.next();
				if(pair.getValue()%2 !=0)
				{
					return false;
				}
			}
			else
			{
				Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>) itr.next();
				if(pair.getValue()%2 !=0)
				{
					if(odd)
					{
						return false;
					}
					odd = true;
				}
			}
		}
		return true;
		
	}
}
