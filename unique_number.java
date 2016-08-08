package guvi;

import java.util.Scanner;

public class unique_number {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("enter the no of elements of array");
	int n=in.nextInt();
	int a[]=new int[n];
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
	a[i]=in.nextInt();	
	}
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==i)
		{
			System.out.println(i);
		}
		else
		{
			continue;
		}
	}
	in.close();
}
}
