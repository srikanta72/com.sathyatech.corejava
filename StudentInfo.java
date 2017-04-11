class Student
{
	int sno;
	String sname;
	float smark;
	static String course;
	static
	{
      System.out.println("i am from static block");
	  course="java";
	}
    Student(int stn,String sn,float mr)
	{
		System.out.println("i am from constructer");
		sno=stn;
		sname=sn;
		smark=mr;
		System.out.println(sno+" "+sname+" "+smark+" "+course);
	}
}
class StudentInfo
{
	public static void main(String[] args) 
	{
		Student s1=new Student(1,"sagar",95.99f);
		Student s2=new Student(2,"girish",65.65f);
	}
}
