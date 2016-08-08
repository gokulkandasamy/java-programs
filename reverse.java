package guvi;

import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	String orev="";
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	   String[] Arr=s.split(" ");
	   for(int i=Arr.length-1;i>=0;i--)
	     {
	       orev=orev+" "+Arr[i];
	     }
	     System.out.println("REVERSED ORDER OF WORDS IN STRING IS:\n"+orev);
	     sc.close();
}
}
