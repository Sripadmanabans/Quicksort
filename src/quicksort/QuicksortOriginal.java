package quicksort;

import java.util.Scanner;

public class QuicksortOriginal 
{
	public static void swap(int ar[], int i, int j) 
	{
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	
	public static int partition(int ar[], int left, int right)
	{
		int pivotValue = ar[left];
		int pivotIndex = left;
		swap(ar, pivotIndex, right);
		int index = left;
		for(int i = left; i < right; i++)
		{
			if(ar[i] < pivotValue)
			{
				swap(ar, index, i);
				index++;
			}
		}
		swap(ar, index, right);
		return index;
	}
	
	public static void sort(int ar[], int l, int u) 
	{
		if(l < u)
		{
			int pivot = partition(ar, l, u);
			sort(ar, l, pivot - 1);
			sort(ar, pivot + 1, u);
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
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(ar[i] + " ");
		}
		sr.close();
	}
}
