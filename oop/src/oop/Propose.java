package oop;

import java.io.PrintWriter;
import java.util.Scanner;

public class Propose {

	public static void main(String[] args)  throws Exception
	{
		A obj=new A();
		Scanner in=new Scanner(System.in);

		System.out.println("hey what's ur name......");
		String name=in.nextLine();
        System.out.println("don't be angry if i'm asked about you.....");
      //  Thread.currentThread();
		Thread.sleep(3000);
		System.out.println("do you have any boyfriend ..?");
		System.out.println("select   yes or no");
		String n1=in.next();
		if(n1.equalsIgnoreCase("yes"))
			{obj.a(name );}
		else if(n1.equalsIgnoreCase("no"))
			{obj.b( name);
				System.out.println("will be my friend..?  yes or no");
                String frnd=in.next();
                if(frnd.equals("yes"))
                {
                	System.out.println("thanks :) "+name);
                	
                	System.out.println("can we exchange our number..?   yes or no");
                    String no_yes=in.next();
                    if(no_yes.equals("yes"))
                    {
                       System.out.println("enter number ");
                	long number=in.nextLong();
					PrintWriter save=new PrintWriter("xxz.txt");
                	save.println(name);
                	save.println(number);
                	save.println("please tap cursor on cmd then select ok");
                	save.flush();
                	System.out.println("plz confirmed ...");

                	Runtime open=Runtime.getRuntime();
                	open.exec("notepad.exe D:\\#HTML\\xxz.txt");
                	 System.out.println("if ok enter ok");
                	 String ok=in.next();
                     if(ok.equals("ok"))
                     {
                     	open.exec("taskkill /IM notepad.exe");
                     	System.out.println("love youuu..");
                     }
                   }
                   else
                   	{System.out.println("koi baat noi :[ ");}
                }
                else
                {
                	System.out.println("it's ok :[ ");
                }
			}
		else
		{
            System.out.println("forgot this");
		}
	
	}
}
class A
{
	void a(String n)throws Exception
	{    
		System.out.println("BTW "+n+" UUUU.....really .......   ... ..");
        Thread.sleep(3000);

		int t=5;
		  while(t!=0){ System.out.println(" looking so preety");
        Thread.sleep(100);
       
          t--; } System.out.println("always be happy..");
	}
	void b(String n1) throws Exception
	{
		char o=3;// to print
		System.out.println("hy ..i'm Chandan ..");
		for(int i=1;i<=5;i++)
		{
			for(int su=1;su<5-i;su++)
			{
				System.out.print("  ");
			}
			for (int sl=1;sl<=2*i;sl++) 
			{
			 System.out.print(" O");	
			 Thread.sleep(200);
			}
			for(int ns=1;ns<(7-i)-i;ns++)
			{
				System.out.print("  ");
			}
			for (int nsl=1;nsl<=2*i;nsl++) 
			{
			  if(nsl==7)
			  break;
			  System.out.print(" @");
			  Thread.sleep(150);	
			}
          System.out.println();
		}
		//for(int nsl1=1;nsl1<=2;nsl1++)
		{
		   for(int nsl2=1;nsl2<5;nsl2++)
		   {
             System.out.print(" O");
             Thread.sleep(100);
		   }
		}System.out.println(/*" Nanu ninnannu pritisuttene.."*/n1 +" Nivu sundaravagi kanuttiddiri"+o+" "+o+" "+o);
		for(int r=0;r<7;r++)
           	{
           		for(int rs=0;rs<r;rs++)
           		{
           			System.out.print("  ");
           		}
           		for(int ro=1;ro<=13-2*r;ro++)
           		{
           			System.out.print(" O");
           			Thread.sleep(50);
           		}
           		System.out.println(" O");
		    }
	}
}
