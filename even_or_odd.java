import java.util.Scanner;
public class even_or_odd {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String string = input.next();
	int n=Integer.parseInt(string);
	if(n>0)
	{
		System.out.println("given no is positive");
	}
	else if(n<0)
	{
		System.out.println("given no is negative");
		
	}
	else
	{
	System.out.println("is equal to zero");	
	}
	}

}
