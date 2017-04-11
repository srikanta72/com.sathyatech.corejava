class Big
{
	int a,b,c,Bi;
	void set(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void checkBig()
	{
		if ((a==b)&&(b==c)&&(c==a))
		{
			System.out.println("three values are equale");
		}
			else
		{
		    Bi=a;
			if (b>Bi)
			{
			Bi=b;
			}
			if (c>Bi)
		    {
			Bi=c;
			}
			System.out.println("Big value="+Bi);
		}
	}
}
class BigDemo 
{
	public static void main(String[] args) 
	{
		if (args.length!=3)
		{
			System.out.println("plz enter 3 value");
		}
		else
		{
			int x1=Integer.parseInt(args[0]);
			int x2=Integer.parseInt(args[1]);
			int x3=Integer.parseInt(args[2]);
			Big b=new Big();
			b.set(x1,x2,x3);
			b.checkBig();
		}
	}
}
