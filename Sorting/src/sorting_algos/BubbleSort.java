package sorting_algos;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BubbleSort {
	public static void bubbleSort(ArrayList orig)
	{
		int size =orig.size();
		boolean flag=false;
		for(int i=0;i<size-1;i++)
		{
			flag = false;
			for(int j=i+1;j<size;j++)
			{
				if((int)orig.get(i) > (int)orig.get(j))
				{
					int temp = (int) orig.get(i);
					orig.set(i, (int) orig.get(j));
					orig.set(j, temp);
					flag=true;
				}
			}
			if(!flag)
			{
				break;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		System.out.println("Input size of array");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=Integer.parseInt(br.readLine());
		ArrayList<Integer> data =new ArrayList<>();
		for(int i=0;i<size;i++)
		{
			int temp = Integer.parseInt(br.readLine());
			data.add(temp);
		}
		bubbleSort(data);
		for(int i=0;i<size;i++)
		{
			System.out.println(data.get(i));
		}
	}

}
