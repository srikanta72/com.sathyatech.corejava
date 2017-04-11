import java.util.Scanner;
class Kbd 
{
	public static void main(String [] args)
	{
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter 1st value");
	   String x1=s.nextLine();
	   System.out.println("Enter 2nd value");
	   int x2=Integer.parseInt(s.nextLine());
	   System.out.println("Enter 3rd value");
	   String x3=s.nextLine();
	   System.out.println(x1+"-"+x2+"-"+x3);
	}
}
