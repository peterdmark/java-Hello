
public class Fibonacci 
{
	static final int MAX_INDEX = 20;
	
	public static void fibo(String[] args)
	{
		int lo = 1;
		int hi = 1;
		System.out.println(hi);
		for (int i = 0; i < MAX_INDEX; i++)
		{
			//System.out.println(lo);
			hi = lo + hi;
			lo = hi - lo;
			System.out.println(lo);
		}
	}
}
