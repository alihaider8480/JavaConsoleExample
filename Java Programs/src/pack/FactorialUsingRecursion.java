package pack;

public class FactorialUsingRecursion 
{
	
	public static int fac(int num)
	{
		if(num>1)
		{
		   return num*fac(num-1);
		}
		return 1;
	}
	public static void main(String[] args) 
	{
	    
		System.out.println(fac(4));
	}

}
