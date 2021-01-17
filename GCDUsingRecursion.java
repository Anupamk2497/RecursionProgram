package Recursion;

import java.util.Scanner;

public class GCDUsingRecursion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(((a>0 && a<21) && (b>0 && b<21))){
		System.out.println("HCF of Two number:-"+hcf(a,b));
		}
		else{
			System.out.println("Both Number Should be greater then 0 and less then 21");
		}
		

	}
	static int hcf(int a,int b)
	{
		if(b==0)
			return a;
		else
			return hcf(b,a%b);
	}

	
}
