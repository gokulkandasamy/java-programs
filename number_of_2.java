package guvi;

import java.util.Scanner;

public class number_of_2 {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=0,c=0,d=0,e=0;
		a=n%10;
		if(a==2)
		{
			count++;
		}
		b=(n/10)%10;
		if(b==2)
		{
			count++;
		}
		c=(n/100)%10;
		if(c==2)
		{
			count++;
		}
		d=(n/1000)%10;
		if(d==2)
		{
			count++;
		}
		e=(n/10000);
		if(e==2)
		{
			count++;
		}
		System.out.println("no of 2's is :"+count);
		s.close();
	}
	

}
