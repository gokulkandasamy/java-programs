package guvi;

import java.util.Scanner;

public class player1 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String q=sc.nextLine();
StringBuffer s=new StringBuffer(q);
System.out.println("the reversed word :"+s.reverse());
sc.close();
}
}