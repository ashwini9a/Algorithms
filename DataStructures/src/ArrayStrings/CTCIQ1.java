package ArrayStrings;

import java.util.Scanner;

public class CTCIQ1 {
	

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String sent = sc.nextLine();
		boolean f[]= new boolean[256];
		boolean flag=true;
		int len = sent.length();
		for(int i=0;i<256;i++)
		{
			f[i]=false;
		}
		for(int i=0;i<len;i++)
		{
			int ind = sent.charAt(i);
			if(f[ind])
			{
				flag=false;
				System.out.println("Not unique chars");
				break;
			}
			else
			{
				f[ind]= true;
			}
		}
		if(flag)
		{
			System.out.println("Unique chars");
		}
	}
}
