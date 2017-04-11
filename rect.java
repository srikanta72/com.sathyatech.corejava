class Rect 
{
  float l,b,Ar,Pr;
  void set()
	{
	  l=2.5f;
      b=3.5f;
    }
  void area()
	{
	  Ar=l*b;
	}
  void peri()
	{
	  Pr=2*l*b;
	}
  void disply()
	{
	  System.out.println("value of l="+l);
	  System.out.println("value of b="+b);
      System.out.println("area of rectangle="+Ar);
	  System.out.println("perimeter of rectangle="+Pr);
	}
}


class Rectangle
{
	public static void main(String k[])
	{
		Rect R = new Rect();
		R.set();
		R.area();
		R.peri();
		R.disply();
	}
}
