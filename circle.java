class Circle
{
	float r,Ac,Pc;
	void set(float n)
	{
		r=n;
	}
	void calarea()
	{
		Ac=1.1317f*r*r;
	}
	void calperi()
	{
		Pc=2*1.1317f*r;
	}
	void display()
	{
		System.out.println("value of r="+r);
		System.out.println("area of circle="+Ac);
		System.out.println("perimeter of circle="+Pc);
	}
}  
class CircleDemo
{
	public static void main(String k[])
	{
		if(k.length!=1)
		{
			System.out.println("plz enter one redious");
		}
			else
		{
				float x1=Float.parseFloat(k[0]);
				Circle c=new Circle();
				c.set(x1);
				c.calarea();
				c.calperi();
				c.display();
		}
	}
}
