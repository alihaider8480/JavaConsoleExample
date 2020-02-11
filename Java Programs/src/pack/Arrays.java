package pack;

import java.util.Scanner;

public class Arrays 
{
    public static void main(String[] args) 
	{
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Enter Value : ");
	   int a = scan.nextInt();
       int[] arr1;              // declration
       arr1= new int[a];        // creation
 	  
       for (int i = 0; i < arr1.length; i++)
       {
		     arr1[i] = scan.nextInt();
	   }
	   System.out.println("For Loop");
       for (int i = 0; i < arr1.length; i++) 
       {
		 System.out.print(arr1[i]);
		 System.out.print(" ");		 
	   }
       System.out.println();	
       
       ///////////////////////////////////////////////////////
       
       System.out.println("For Each Loop");
       int[] arr2= {55,56,57};
       for(int i:arr2) 
       {
		 System.out.print(i);	 
		 System.out.print(" ");
	   }
       System.out.println();
       
       ////////////////////////////////////////////////
       
       System.out.println("Two Diensional Arrays");
       int[][] dou  = { {68,94},{45,557,59} };
       System.out.println(dou.length);
       System.out.println(dou[0].length);
       System.out.println(dou[1].length);        	
       System.out.println(dou[0][1]);
       System.out.println(dou[1][2]);
   	   
       System.out.println("\n print two dimensional Arrays");
       
       for(int i=0;i<dou.length;i++)
       {
    	   for (int j = 0; j < dou[i].length; j++) 
    	   {
    		   System.out.print(dou[i][j]);
    		   System.out.print(" ");
		   }
    	   System.out.println();
       }
       
       
	}

}
