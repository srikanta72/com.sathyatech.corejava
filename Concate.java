import java.util.Scanner;
class Concate
{
	String a,b;
	Concate()
	{
		a=b=null;
	}
	Concate(String a,String b)
	{
		this.a=a;
		this.b=b;
	}
	Concate add(Concate x,Concate y)
	{
		Concate p1=new Concate();
		p1.a=this.a+"-"+x.a+"-"+y.a;
        p1.b=this.b+"-"+x.b+"-"+y.b;
		return p1;
	}
	void disply()
	{
		System.out.println("valof a="+a);
		System.out.println("val of b="+b);
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 String val for t1");
		String x1=s.nextLine();
		String x2=s.nextLine();
		System.out.println("Enter 2 String val for t2");
		String x3=s.nextLine();
		String x4=s.nextLine();
		System.out.println("Enter 2 String val for t3");
		String x5=s.nextLine();
		String x6=s.nextLine();
        Concate t1=new Concate(x1,x2);
		Concate t2=new Concate(x3,x4);
		Concate t3=new Concate(x5,x6);
		Concate t4=new Concate();
		t4=t1.add(t2,t3);
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
		System.out.println("----------");
		System.out.println("t4 val");
		System.out.println("----------");
		t4.disply();
	}
}
