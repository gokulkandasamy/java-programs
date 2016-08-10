package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largest_in_array6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=0;i<a.length-1;i++)
			{
		if(a[i]==a[i+1])
		{
			count++;
		}else
			
		{
			continue;
		}
			}
	System.out.println(count);
	sc.close();
	}

}
