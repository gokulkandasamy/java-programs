package guvi;

import java.util.Scanner;

public class player2 {
public static void main(String[] args) {
	int f=1;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		f=f*i;
	}
	System.out.println(f);
	sc.close();
}
}
