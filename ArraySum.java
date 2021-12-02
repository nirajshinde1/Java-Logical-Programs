import java.util.*;

class Sum
{
	public int Add(int Brr[])
	{
		int iSum = 0, iCnt = 0;
		for(iCnt = 0; iCnt < Brr.length; iCnt++)
		{
			iSum = iSum + Brr[iCnt];
		}
		return iSum;
	}
}
class ArraySum
{
	public static void main(String args[]) 
	{
		Scanner sobj = new Scanner(System.in);
		int iSize = 0, iCnt = 0, iRet = 0;

		System.out.println("Enter Number of elements :");
		iSize = sobj.nextInt();

		int Arr[] = new int[iSize];
		System.out.println("Enter Numbers :");
		for(iCnt = 0; iCnt < Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		Sum s = new Sum();
		iRet = s.Add(Arr);
		System.out.println("Addition is :"+iRet);
	}
}