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
	void sum(Test x1,Test x2)
	{
		this.a=x1.a+x2.a;
		this.b=x1.b+x2.b;
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
	}
	void disply()
	{
		System.out.println("val of a="+a);
        System.out.println("val of b="+b);
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 val for t1");
		int x1=Integer.parseInt(s.nextLine());
		int x2=Integer.parseInt(s.nextLine());
		System.out.println("Enter 2 valfor t2");
		int x3=Integer.parseInt(s.nextLine());
		int x4=Integer.parseInt(s.nextLine());
		Test t1=new Test(x1,x2);
        Test t2=new Test(x3,x4);
		Test t3=new Test();
		System.out.println("----------");
		System.out.println("t1 val");
		System.out.println("----------");
		t1.disply();
		System.out.println("----------");
		System.out.println("t2 val");
		System.out.println("----------");
		t2.disply();
		System.out.println("----------");
		System.out.println("t3 val");
		System.out.println("----------");
		t3.sum(t1,t2);

	}
}
