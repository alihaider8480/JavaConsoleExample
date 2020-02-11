package pack;

import java.util.Scanner;

class Account 
{
	public int account_balance;
	
	public Account(int account_balance)
	{
		this.account_balance=account_balance;
	}
}

class Withdraw implements Runnable
{
	public Account account;
	//int balance = 1000;//= account.account_balance;
	public int with_draw;
	public int bal;
	public String name;
	
	@Override
	synchronized
	public void run()
	{
		//System.out.println(account.account_balance);
		
		if(bal>with_draw)
			with_drawl(with_draw);
		else
			System.out.println("Insuficant Balance");
	}
    
	
	public void with_drawl(int with_draw_ammont)
	{
		//System.out.println(name+"////"+with_draw_ammont+"////"+bal);
		bal=bal-with_draw_ammont;
		System.out.println(name+": Your Current Balance is : "+bal);
	}
	
	public Withdraw(String name,Account acount)
	{
		//System.out.println(acount.account_balance);
		int aa = acount.account_balance;
		this.bal=aa;
		this.name=name;
		this.account=acount;
	}
}

public class SyncronizedMultiThread 
{
	public static void main(String[] args) 
	{       
       Account a1 = new Account(1000);
       Withdraw w1 = new Withdraw("Ali",a1);
       Withdraw w2 = new Withdraw("Nadeem,",a1);
       
       w1.with_drawl(600);
       w2.with_drawl(500);
       Thread t1 = new Thread(w1);
       Thread t2 = new Thread(w2);
       t1.start();
       t2.start();
	}
}








/*
package aaaaaaaaaaaaaaaaaaaaaa;

import java.util.Scanner;

class Account 
{
	public int account_balance;
	
	public Account(int account_balance)
	{
		this.account_balance=account_balance;
	}
}
class Withdraw implements Runnable
{
	private Account account;
	//int balance = 1000;//= account.account_balance;
	private int with_draw;
	int bal;
	private String name;
	
	public void run()
	{
		System.out.println(account.account_balance);
		if(account.account_balance>with_draw)
			with_drawl(with_draw);
		else
			System.out.println("Insuficant Balance");
	}
	
	public void with_drawl(int with_draw_ammont)
	{
		System.out.println(name);
		bal=bal-with_draw_ammont;
		System.out.println(name+": Your Current Balance is : "+bal);
	}
	
	public Withdraw(String name,int with_draw,Account account)
	{
		this.bal=account.account_balance;
		this.name=name;
		this.with_draw=with_draw;
	}
	
}
public class SyncronizedMultiThread 
{
	public static void main(String[] args) 
	{       
       Account a1 = new Account(1000);
       Withdraw w1 = new Withdraw("Ali",500,a1);
       Withdraw w2 = new Withdraw("Nadeem,",500,a1);
       
      // w1.with_drawl(with_draw_ammont);
       Thread t1 = new Thread(w1);
       Thread t2 = new Thread(w2);
       t1.start();
       t2.start();
	}
}
*/