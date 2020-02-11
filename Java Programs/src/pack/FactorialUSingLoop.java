package pack;

import java.util.Scanner;

public class FactorialUSingLoop 
{ 
 public static void main(String[] args) 
 {
	int f=1;
	System.out.println ("Please Enter Integer Number");
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt(); 
    while(a!=0) {
          f=a*f;
    	  a--;
      }
    System.out.print(f);
  }
}
