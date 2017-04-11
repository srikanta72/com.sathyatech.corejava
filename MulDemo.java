class Mul
{
	int a,b,r;
	void accept(int n,int m)
	{
		a=n;
		b=m;
	}
	void cal()
	{
		r=a*b;
	}
	void display()
	{
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		System.out.println("value of mul="+r);
	}
}
class MulDemo 
{
	public static void main(String k[])
		
	{
		if (k.length!=2)
		{
			System.out.println("plz enter two value");
		}
		else
		{
			int x1=Integer.parseInt(k[0]);
			int x2=Integer.parseInt(k[1]);
			Mul m=new Mul();
			m.accept(x1,x2);
			m.cal();
			m.display();
		}
	}
}
