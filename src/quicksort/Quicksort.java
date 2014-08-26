package quicksort;

import java.util.Scanner;

public class Quicksort
{
	public static void move(int ar[], int low, int high) 
	{
		int j = high;
		int temp;
		while(j > low)
		{
			temp = ar[j];
			ar[j] = ar[j - 1];
			ar[j - 1] = temp;
			j--;
		}
	}
	
	public static int partition(int ar[], int begin, int end) 
	{
		int pivotValue = ar[begin];
		int pivotIndex = begin;
		for(int i = begin; i <= end; i++)
		{
			if(ar[i] < pivotValue)
			{
				move(ar, pivotIndex, i);
				pivotIndex++;
			}
		}
		return pivotIndex;
	}
	
	public static void sort(int ar[], int l, int u) 
	{
		int index;
		if(l < u)
		{
			index = partition(ar, l , u);
			sort(ar, l, index - 1);
			sort(ar, index + 1, u);
			for(int i = l; i <= u; i++)
			{
				System.out.print(ar[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) 
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int ar[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			ar[i] = sr.nextInt();
		}
		
		sort(ar, 0, ar.length - 1);
		
		sr.close();
	}
}
