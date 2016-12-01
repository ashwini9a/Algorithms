package ArrayStrings;

import java.util.Scanner;

public class CTCIQ4 {

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String sent1 = sc.nextLine();
		int len = sent1.length();
		char[] chars =new char[len];
		int spaces=0;
		for(int i=0;i<len;i++)
		{
			chars[i]= sent1.charAt(i);
		}
		for(int i=0;i<len;i++)
		{
			if(chars[i]==' ')
			{
				spaces++;
			}
		}
		int len2 = len+spaces*3;
		char[] chars1 =new char[len2];
		if(spaces>0)
		{
			int j=len-1;
			for(int i = len2-1;i>=0 && j>=0;i--)
			{
				if(chars[j] == ' ')
				{
					chars1[i] = '0';i--;
					chars1[i] = '2';i--;
					chars1[i] = '%';
					j--;
				}
				else
				{
					chars1[i] = chars[j];
					j--;
				}
				
			}
		}
		for(int i=0;i<len2;i++)
		{
			System.out.print(chars1[i]);
		}
		
	}
	
}
