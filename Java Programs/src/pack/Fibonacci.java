package pack;

public class Fibonacci 
{
 public static void main(String[] args) 
 {
   int a=0;
   int b=1;
   int sum=a+b;
   System.out.println(a);
   System.out.println(b);
   while(sum<=50)
   {
	   a=b;
	   b=sum;
	   sum=a+b;
	   System.out.println(sum);
   }
   
 }
}
