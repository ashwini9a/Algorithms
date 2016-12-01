package ArrayStrings;

import java.util.Arrays;
import java.util.Scanner;

public class CTCIQ5 {
			
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String original = sc.nextLine();
//        char[] chars = original.toCharArray();
//        Arrays.sort(chars);
//        String sorted = new String(chars);
//        System.out.println(sorted);
		String fomatted="";
		int len = original.length();
		int i=0;
		while(i<len)
		{
			int count=1,j=i+1;
			char a = original.charAt(i);
			while(true)
			{
				if(j<len && a==original.charAt(j))
				{
					count++;
					j++;
				}
				else
				{
					i=j;
					break;
				}
			}
			fomatted+=a+""+count;
		}
        if(len==fomatted.length() || len<fomatted.length())
        {
        	System.out.println(original);
        }
        else
        {
        	System.out.println(fomatted);
        }
        
	}
	
}
