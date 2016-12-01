package ArrayStrings;

import java.util.Scanner;

public class CTCIQ3 {
	public static boolean isSubString(String sent1,String sent2)
	{
		int len1 = sent1.length();
		int len2 = sent2.length();
		int j=0;
		for(int i=0;i<len1;i++)
		{
			if(sent1.charAt(i)== sent2.charAt(j))
			{
				j++;
				if(j==len2)
				{
					return true;
				}
			}
			else
			{
				j=0;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String sent1 = sc.nextLine();
		
		String sent2 = sc.nextLine();
		
		String sent = sent1+sent1;
		if(isSubString(sent,sent2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}
