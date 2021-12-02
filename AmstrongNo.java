import java.util.*;

class AmstrongFun
{
	public boolean CheckArmstrong(int iNo)
	{
		int iTemp = 0, iDigCnt = 0, iDigit = 0, iPower = 1;
		int iCnt = 0, iSum = 0;
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		iTemp = iNo;

		while(iTemp != 0)
		{
			iDigCnt++;
			iTemp = iTemp / 10;
		}

		iTemp = iNo;

		while(iTemp != 0)
		{
			iDigit = iTemp % 10;
			for(iCnt = 1; iCnt <= iDigCnt; iCnt++)
			{
				iPower = iPower * iDigit;
			}
			iSum = iSum + iPower;
			iPower = 1; 
			iTemp = iTemp / 10;
		}
		if(iSum == iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class AmstrongNo
{
	public static void main(String args[]) 
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0;
		boolean bRet = false;

		System.out.println("Enter Number:");
		iValue = sobj.nextInt();

		AmstrongFun ams = new AmstrongFun();

		bRet = ams.CheckArmstrong(iValue);

		if(bRet == true)
		{	
			System.out.println("Entered Number is Amstrong");
		}
		else
		{	
			System.out.println("Entered Number is Not Amstrong");
		}

	}

}