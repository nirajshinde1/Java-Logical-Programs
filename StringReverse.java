import java.util.*;

class StringX
{
	public String str; 
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String :");
		str = sobj.nextLine();
	}
	public void Display()
	{
		System.out.println("String is :"+str);
	}

}

class Marvellous extends StringX
{
	public String ReverseX()
	{
		char Arr[] = str.toCharArray();
		int iStart = 0, iEnd = Arr.length-1;
		char temp;
		while(iStart < iEnd)
		{
			temp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = temp;
			iStart++;
			iEnd--;
		}
		// we can write it by two ways
		// return new String(Arr);      // 1  Or
		 return String.valueOf(Arr);	   // 2
		// return Arr.toString();   // garbage
	}
}
class StringReverse
{
	public static void main(String arg[])
	{
		Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display();
		String s = mobj.ReverseX();
		System.out.println("Reverse String is :"+s);
	}
}
