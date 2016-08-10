package guvi;

import java.util.Scanner;

public class hunter40 {
public static void main(String[] args) {
	int sum=0,n=0;
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number of digits");
	int a=in.nextInt();
	System.out.println("enter the numbers");
	int b[]=new int[a];
	for(int i=0;i<a;i++)
	{
		b[i]=in.nextInt();
	}
	for(int i=0;i<a;i++)
	{
		sum+=b[i];
	}
	n=sum;
	int d=0;
	while(n!=0)
	{
		d=d*10;
		d=d+(n%10);
		n=n/10;
	}
	if(d==sum)
	{
		System.out.println("the value is palindrome");
	}
	else
	{
		System.out.println("the value is not palindrome");
	}
	in.close();
}
}
