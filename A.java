import java.util.Scanner;
import java.util.*;
class Edetails
{
	void empDetails()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Emp details one by one");
		int EID= Integer.parseInt(s.nextLine());
		String Ename= s.nextLine();
		float ESal= Float.parseFloat(s.nextLine());
		System.out.println("The Employee details are");
		System.out.println("The Employee ID: "+EID);
		System.out.println("The Employee Name: "+Ename);
		System.out.println("The Employee Salary: "+ESal);
	}
}
class HRD
{
	Collections Employee(int j)
	{
		Collections c1= new Collections();
		for (i=0;i<j ;i++ )
		{
			EDetails e1= new Edetails();
			c1.add (e1);
		}
		return c1;
	}
}
class A 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		HRD h1= new HRD();
		Collection c2= h1.Employee(5);
		System.out.println(c2);
	}
}
