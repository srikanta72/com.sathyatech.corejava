class Square
{
	float a,r;
	void accept(float n)
	{
		a=n;
	}
	void cal()
	{
		r=a*a;
	}
	void display()
	{
		System.out.println("square of("+a+")="+r);
	}
}
class SquareDemo 
{
	public static void main(String k[])
		
	{
		if (k.length!=1)
		{
			System.out.println("plz enter one value");
		}
		else
		{
			float x1=Float.parseFloat(k[0]);
			Square s=new Square();
			s.accept(x1);
			s.cal();
			s.display();
		}
	}
}
