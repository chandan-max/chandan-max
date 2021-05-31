package oop;
import java.util.*;
public class ArrayRotation {
	public static void main(String args[] ) throws Exception 
	    {
	       Scanner sc=new Scanner(System.in);
	      int T=sc.nextInt(); 
	      int N=sc.nextInt();
	      int K=sc.nextInt();
	       
	     int A[]=new int[N];
	    for(int in=0;in<A.length;in++)
	    {
	      A[in]=in+1;
	    }
	    for(int i=0;i<K;i++)
	    {
	      int t =A[A.length-1];
	      for(int j=0;j<A.length-1;j++)
	      {
	          A[(A.length-j)-1]=A[(A.length-j)-2];
	      }
	      A[0]=t;  
	    }
	     for(int in1=0;in1<A.length;in1++)
	    {
	      System.out.print(A[in1]+" ");
	    }
	   }
	    
}
