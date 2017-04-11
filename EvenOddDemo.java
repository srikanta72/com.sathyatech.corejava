class EvenOdd
{
	int n;
	void set(int x)
	{
		n=x;
	}
	String decide()
	{
		int r=n%2;
		if (r==0)
		{
			return("Even");
		}
		else
		{
			return("Odd");
		}
	}
	void display(String s)
	{
		System.out.print(n+" is "+s);
	}
}
class EvenOddDemo 
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
			EvenOdd e=new EvenOdd();
			e.set(x1);
			String res=e.decide();
			e.display(res);
		}
	}
}
