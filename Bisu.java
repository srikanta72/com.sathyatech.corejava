class Bisu 
{
	public static void main(String[] args) 
	{
		int i=12;
		System.out.println(i);
		m(i);
		String speech = "onestwosthreesfoursfive";
		String[] r=speech.split("s",6);
		System.out.println(r);
		for (int x=0;x<r.length ;x++ )
		{
			System.out.println(r[x]);
		}
	}
	public static void m(Integer k)
	{
		int r=k;
		System.out.println(r);
	}
}
//javac -source 1.4 Bisu.java