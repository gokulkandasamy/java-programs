package guvi;

import java.util.Scanner;

public class matrix_sum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int sum=0;
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[][]=new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(int i=1;i<n-1;i++)
	{
		for(int j=1;j<n-1;j++)
		{
			sum=sum+a[i][j];
		}
	}
	System.out.println(sum);
	sc.close();
}
}
