import java.util.*;

class Marvellous
{
	public void Display(String Data)
	{
		System.out.println("");
	}
}
class StringPassing
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		String str;

		System.out.println("Enter your name :");
		str = sobj.nextLine();

		System.out.println("Hello :"+str);
	}
}