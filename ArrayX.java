package MarvellousNumbers;

import java.util.*;
public class ArrayX
{
	public int Arr[];
	public ArrayX(int iSize)
	{
		Arr = new int[iSize];
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Elements:");
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt(); 
		}
	}

	public void Display()
	{
		System.out.println("entered Elements are:");
		for(int iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}