class NumGen
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
			for (int i=1;i<=n;i++)
			{
				System.out.println(i);
			}
		}
	}
}
class NumGenDemo 
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
			NumGen n=new NumGen();
			n.set(x1);
			n.generate();
		}
	}
}
	