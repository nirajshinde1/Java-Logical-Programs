import java.util.*;

class Sorting
{
	public void SelectionSort(int Arr[])
	{
		int i = 0, j = 0, minIndex = 0, temp = 0;
		int size = Arr.length;
		for(i = 0; i < size; i++)
		{
			minIndex = i;
			for(j = i; j < size; j++)
			{
				if(Arr[minIndex] > Arr[j])
				{
					minIndex = j;
				}
			}
			temp = Arr[i];
			Arr[i] = Arr[minIndex];
			Arr[minIndex] = temp;
		}
	}
}

class SortSelection
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

		obj.SelectionSort(Arr);
		System.out.println("Data after sorting");
		for(int i = 0; i < Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}

	}
}