import java.util.Scanner;
class ObjMul
{
	int a,b,c;
	ObjMul()
	{
		a=b=c=0;
	}
	ObjMul(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	ObjMul mul(ObjMul x)
	{
		ObjMul p1=new ObjMul();
		p1.a=this.a*x.a;
        p1.b=this.b*x.b;
		p1.c=this.c*x.c;
		return p1;
	}
	void disply()
	{
		System.out.println("valof a="+a);
		System.out.println("val of b="+b);
		System.out.println("val of c="+c);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 val for t1");
		int x1=Integer.parseInt(s.nextLine());
		int x2=Integer.parseInt(s.nextLine());
		int x3=Integer.parseInt(s.nextLine());
		System.out.println("Enter 3 val for t2");
		int x4=Integer.parseInt(s.nextLine());
		int x5=Integer.parseInt(s.nextLine());
		int x6=Integer.parseInt(s.nextLine());
        ObjMul t1=new ObjMul(x1,x2,x3);
		ObjMul t2=new ObjMul(x4,x5,x6);
		ObjMul t3=new ObjMul();
		t3=t1.mul(t2);
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
		t3.disply();
	}
}
