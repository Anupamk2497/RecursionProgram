package Recursion;

import java.util.Scanner;

public class LCMOfArrayUsingRecursion {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Array:-");
	int size=sc.nextInt();
	System.out.println("Enter the data in Array:-");
	int A[]=new int[size];
	for(int i=0;i<size;i++)
	{
		A[i]=sc.nextInt();
	}
	int result=LcmOf(A,2);
	System.out.println("LCM of Array:-"+result);
	
	
	
}

private static int LcmOf(int[] a, int k) {

    int ans = a[0]; 
  
    for (int i = 1; i < a.length; i++) 
        ans = (((a[i] * ans)) / 
                (gcd(a[i], ans))); 
  
    return ans; 
}
static int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
} 
}
