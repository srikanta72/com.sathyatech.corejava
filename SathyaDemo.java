class Sathya
{
	String a,b;
	Sathya(String x,String y)
	{
		System.out.println("print-----s1/s2");
		a=x;
		b=y;
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
	}
	Sathya(Sathya x1,Sathya x2)
	{
		System.out.println("print----s3");
		a=x1.a+"-"+x2.a;
        b=x1.b+"-"+x2.b;
		System.out.println("val of a="+a);
		System.out.println("val of b="+b);
	}
}
class SathyaDemo 
{
	public static void main(String[] args) 
	{
		if (args.length!=4)
		{
		System.out.println("Plz enter 4 value");
		}
		else
		{
			Sathya s1=new Sathya(args[0],args[1]);
			Sathya s2=new Sathya(args[2],args[3]);
			Sathya s3=new Sathya(s1,s2);
		}
	}
}
