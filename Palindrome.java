package guvi;

public class Palindrome {
public static void main(String[] args) {
	String s="malqayalam";
	int m=0;
	for(int i=0;i<s.length();i++)
	{
	String str=s.substring(0,i);
	String str1=s.substring(i+1);
	String dup=str+str1;
	StringBuffer sq=new StringBuffer(dup);
	sq.reverse();
	if(dup.equals(sq.toString()))
	{
		System.out.println("becomes palindrome on removing :"+s.charAt(i));
		m=1;
		break;
	}
}
	if(m==0)
	{
		System.out.println("cannot be formed");
	}
}
}
