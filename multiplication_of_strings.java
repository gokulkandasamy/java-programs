package guvi;

import java.util.Scanner;

public class multiplication_of_strings {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String a=s.nextLine();
	String g=s.nextLine();
	int n=Integer.parseInt(a);
	int e=Integer.parseInt(g);
	int w=n*e;
	System.out.println(String.valueOf(w));
	s.close();
	}

}
