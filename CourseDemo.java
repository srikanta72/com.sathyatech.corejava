class Course
{
	String[] values()
	{
		String a[]={"java","oracle","jdk"};
		return a;
	}
	void display(String k[])
	{
		System.out.println("Array contants");
		for (int i=0;i<k.length;i++)
		{
		System.out.println(k[i]);
		}
	}
}
class CourseDemo
{
	public static void main(String[] args) 
	{
		Course c=new Course();
		String x[]=c.values();
		c.display(x);
	}
}
