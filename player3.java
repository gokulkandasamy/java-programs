package guvi;

import java.util.Scanner;

public class player3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int d=0;
	while(n!=0)
	{
		d=d*10;
		d=d+(n%10);
		n=n/10;
	}
	System.out.println(d);
	sc.close();
}
}
