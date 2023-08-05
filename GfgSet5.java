class First
{
	int i = 10;

	public First(int j)
	{
		System.out.println(i);
		this.i = j * 10;
	}
}

class Second extends First
{
	public Second(int j)
	{
		super(j);
		System.out.println(i);
		this.i = j * 20;
	}
}

public class GfgSet5
{
	public static void main(String[] args)
	{
		Second n = new Second(20);
		System.out.println(n.i);
	}
}
