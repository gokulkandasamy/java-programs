package guvi;

import java.util.Scanner;

public class elminating_repeated_one {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	char a=' ';
	String str=" ";
	for(int i=0;i<s.length();i++)
	{
		a=s.charAt(i);
		if(a!=' ')
		{
			str=str+a;
			s=s.replace(a, ' ');
		}
			
		
	}
	System.out.println(str);
	in.close();
	
	
}
}
