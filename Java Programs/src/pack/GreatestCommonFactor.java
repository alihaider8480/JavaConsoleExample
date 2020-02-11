package pack;

import java.util.Scanner;

public class GreatestCommonFactor 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two the number");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int h;
        for(h=a<b?a:b; h>=1;h--)
        {
            if(a%h==0&&b%h==0)
            {
                System.out.println(h);
                break;
            }
        }
 	}
}