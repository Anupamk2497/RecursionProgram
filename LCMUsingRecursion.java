package Recursion;

import java.util.Scanner;

public class LCMUsingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int result=0;
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>0 && b>0 ){
		result=LcmOf(a,b,2);
		System.out.println("result"+result);}
		System.out.println(" a and b must be greater then 0");
		
	}
	static int LcmOf(int a,int b,int k)
	{
		
		if(a==1 || b==1)
		{
			return a*b;
		}
		else if(a==b)
		{
		   return a;	
		}
		else{
			
			if(a%k==0 && b%k==0)
			{
				return k*LcmOf(a/k,b/k,k);
			}
			else{
				if(k<=Min(a,b)/2)
				{return LcmOf(a,b,k+1);}
				else
					return a*b;
			}
		}
		
	}
	static int Min(int a,int b)
	{
		if(a>b)return b;
		else return  a;
	}

}
