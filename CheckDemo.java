class Check
{
	int n;
	void set(int a)
	{
		n=a;
	}
	void decide()
	{
		if (n>0)
		{
			System.out.println(n+"is possitive");
		}
		else
		{
			if (n<0)
			{
				System.out.println(n+"is negetive");
			}
			else
			{
				System.out.println(n+"is zero");
			}
		}
	}
}
class CheckDemo 
{
	public static void main(String[] args) 
	{
		if (args.length!=1)
		{
			System.out.println("plz enter one value");
		}
		else
		{
			int x=Integer.parseInt(args[0]);
			Check c=new Check();
			c.set(x);
			c.decide();
		}
	}
}
