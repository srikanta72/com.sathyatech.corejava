import java.util.Scanner;
class ReadKbd
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter sno");
		int sno=Integer.parseInt(s.nextLine());
		System.out.println("enter sname");
		String sname=s.nextLine();
		System.out.println("enter smark");
		float smark=Float.parseFloat(s.nextLine());
		System.out.println("enter cname");
		String cname=s.nextLine();
		System.out.println("------------");
		System.out.println("student detail");
		System.out.println("------------");
		System.out.println("student no.="+sno);
		System.out.println("student name="+sname);
		System.out.println("student mark="+smark);
		System.out.println("student clg="+cname);
	}
}
