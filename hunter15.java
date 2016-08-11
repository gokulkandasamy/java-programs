package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class hunter15 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int n=s.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		Arrays.sort(b);
		for(int i=b.length-1;i>=b.length-3;i--)
		{
			System.out.println(b[i]);
		}
		s.close();
	}

}
