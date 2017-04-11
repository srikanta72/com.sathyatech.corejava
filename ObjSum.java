import java.util.Scanner;
class Test
{
	int a,b;
	Test()
	{
		a=b=0;
	}
	Test(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	Test sum(Test x)
	{
		Test p1=new Test();
		p1.a=this.a+x.a;
		p1.b=this.b+x.b;
		return p1;
	}
	void disply()
	{
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
	}
}
class ObjSum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 value for 1st t1");
		int x1=Integer.parseInt(s.nextLine());
		int x2=Integer.parseInt(s.nextLine());
        System.out.println("Enter 2 value for 1st t2");
        int x3=Integer.parseInt(s.nextLine());
		int x4=Integer.parseInt(s.nextLine());
		Test t1=new Test(x1,x2);
		Test t2=new Test(x3,x4);
		Test t3=new Test();
		t3=t1.sum(t2);
		System.out.println("------------");
		System.out.println("val of t1");
		System.out.println("------------");
		t1.disply();
		System.out.println("------------");
		System.out.println("val of t2");
		System.out.println("------------");
		t2.disply();
		System.out.println("------------");
		System.out.println("val of t3");
		System.out.println("------------");
		t3.disply();
	}
}
