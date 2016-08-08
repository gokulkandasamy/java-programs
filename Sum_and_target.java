package guvi;

import java.util.Scanner;

public class Sum_and_target {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("enter the no of elements of array");
	int n=in.nextInt();
	int a[]=new int[n];
	System.out.println("enter the target value");
	int m=in.nextInt();
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
	a[i]=in.nextInt();	
	}
	for(int i=0;i<a.length;i++)
	{
	    for(int j=1;j<a.length;j++)
	    {
	    	if(a[i]+a[j]==m)
	    	{
	    		System.out.println("The values are equal"+a[i]+a[j]);
	    	}
	    }
}
	in.close();
}
}
