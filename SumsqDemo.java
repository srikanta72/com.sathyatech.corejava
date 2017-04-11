class Sumsq
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
			int s=0;
			int sq=0;
			for (int i=1;i<=n;i++)
			{
				System.out.println(i);
				s=s+i;
				sq=sq+(i*i);
			}
			System.out.println("==========");
            System.out.println("sum of these numbers="+s);
			System.out.println("sum of squeres of these numbers="+sq);
		}
	}
}
class SumsqDemo
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
			Sumsq sq=new Sumsq();
			sq.set(x1);
			sq.generate();
		}
	}
}
