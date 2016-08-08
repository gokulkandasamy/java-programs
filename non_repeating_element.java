package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class non_repeating_element {
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
Arrays.sort(a);

for(int i=0;i<a.length-1;i++)
{
	if(a[i]!=a[i+1])
	{
		System.out.println(a[i]);
		break;
	}
	i=i+1;	
}

	in.close();
}
}
