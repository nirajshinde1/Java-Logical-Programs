import java.util.*;

class Sorting
{
	public void InsertionSort(int Arr[])
	{
	    int i = 0, j = 0, key = 0;
		int size = Arr.length;
		for(i = 0; i < size; i++)
		{
			key = Arr[i];
			for(j = i-1; (j >= 0) && (Arr[j] > key); j--) // one of the great logic
			{
				Arr[j+1] = Arr[j];
			}
			Arr[j+1] = key;
		}
	}
}

class SortInsertion
{
	public static void main(String args[]) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sobj.nextInt();

		int Arr[] = new int[size];

		System.out.println("Enter the elements :");
		for(int i = 0;i<Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		Sorting obj = new Sorting();

		obj.InsertionSort(Arr);
		System.out.println("Data after sorting");
		for(int i = 0; i < Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}

	}
}