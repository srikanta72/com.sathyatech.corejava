//Dser.java
import java.io.*;
import java.util.Scanner;
import sp.Student;

class Dser 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the file name to read student data");
			String fname= s.nextLine();
			FileInputStream fis= new FileInputStream(fname);

			ObjectInputStream ois= new ObjectInputStream(fis);

			Object obj= ois.readObject();

			Student so= (Student)obj;//Object typecasting

			System.out.println("Student details are");
			System.out.println("No. is:" +so.getStno());
			System.out.println("Name is:" +so.getName());
			System.out.println("Marks is:" +so.getMarks());

			ois.close();
			fis.close();
		}
		catch (FileNotFoundException f)
		{
			System.err.println(f);
		}
		catch (IOException f)
		{
			System.err.println(f);
		}
		catch (Exception f)
		{
			System.err.println(f);
		}
	}
}
