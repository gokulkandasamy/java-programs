package guvi;

import java.util.Scanner;

public class hunter_72 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	String s=in.nextLine();
	String h="";
	String a[]=s.split(" ");
	for(int i=0;i<a.length;i++)
	{
		StringBuffer buf=new StringBuffer(a[i]);
		buf.reverse();
		h=h+buf.toString()+" ";
		
	}
	System.out.println(h);
	in.close();
}
}
