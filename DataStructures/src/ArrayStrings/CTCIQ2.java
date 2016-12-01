package ArrayStrings;

import java.util.Scanner;

public class CTCIQ2 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String sent = sc.nextLine();
		int len = sent.length();
		char[] chars =new char[len];
		char[] rev =new char[len];
		for(int i=0;i<len;i++)
		{
			chars[i]= sent.charAt(i);
		}
		int strt,end;
		strt = 0;
		end = len-1;
		while(strt<end)
		{
			char temp = chars[strt];
			chars[strt] = chars[end];
			chars[end] = temp;
			strt++;
			end--;
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(chars[i]);
		}
	}

}
