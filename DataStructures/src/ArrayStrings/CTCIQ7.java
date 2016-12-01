package ArrayStrings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CTCIQ7 {
	public static void display(int[][] matrix)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int[][] matrix = new int[5][5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		display(matrix);
		System.out.println();
		ArrayList cols = new ArrayList();
		ArrayList rows = new ArrayList();
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(matrix[i][j]==0)
				{
					if(!cols.contains(j))
					{
						cols.add(j);
					}
					if(!rows.contains(i))
					{
						rows.add(i);
					}
					
					break;
				}
			}
		}
		Iterator<Integer> itr = rows.iterator();
		while(itr.hasNext())
		{
			int i = itr.next();
			for(int j=0;j<5;j++)
			{
				matrix[i][j]=0;
			}
		}
		Iterator<Integer> itr1 = cols.iterator();
		while(itr1.hasNext())
		{
			int i = itr1.next();
			for(int j=0;j<5;j++)
			{
				matrix[j][i]=0;
			}
		}
		display(matrix);
		
	}

}
