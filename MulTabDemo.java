class MulTab
{
	int n;
	void set(int x)
	{
		n=x;
	}
	void generate()
	{
		if (n<=0)
		{
			System.out.println(n+"is invalid input enter positive value");
		}
		else
		{
			for (int i=1;i<=10;i++)
			{
				System.out.println(n+"*"+i+"=("+n*i+")");
			}
		}
	}
}
class MulTabDemo 
{
	public static void main(String[] args) 
	{
		if (args.length!=1)
		{
			System.out.println("Plz enter one value");
		}
		else
		{
			int x1=Integer.parseInt(args[0]);
			MulTab m=new MulTab();
			m.set(x1);
			m.generate();
		}
	}
}
