package pack;

public class StarPattern 
{
    public static void main(String[] args) 
    {
    	System.out.println("///////////////////");
    	int j;
	    for(int i=9;i>1;i--)
    	{
	    	  for(j=1;j<=i;j++)
	    	  {
    	        System.out.print("*");	
	    	  }
	    	  j++;
	    	  System.out.println();
    	}
	}
}
