import java.util.*;

class Array
{
	public static void main(String args[]) 
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0;

		System.out.println("Enter Number of elements :");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];
		System.out.println("Enter Numbers :");
		for(iCnt = 0; iCnt < Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}

		System.out.println("Entered Numbers are :");
		for(iCnt = 0; iCnt < Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}