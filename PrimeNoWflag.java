import java.util.*;

class Prime
{
	public boolean ChkPrime(int iNo)
	{	
		int iCnt = 0;
		boolean bFlag = true;
		for(iCnt = 2; iCnt <= iNo/2; iCnt++)
		{
			if((iNo % iCnt) == 0)
			{
				bFlag = false;
				break;
			}

		}
		return bFlag;
	}
}
class PrimeNoWflag
{
	public static void main(String args[]) 
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0;
		boolean bRet = false;

		System.out.println("Enter Number:");
		iValue = sobj.nextInt();

		Prime pobj = new Prime();

		bRet = pobj.ChkPrime(iValue);

		if(bRet == true)
		{	
			System.out.println("Entered Number is Prime");
		}
		else
		{	
			System.out.println("Entered Number is Not Prime");
		}

	}

}