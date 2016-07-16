import java.util.Arrays;
public class occerance_of_max_num {

	public static void main(String[] args) {
		int[] n=new int [10];
		int q=1,x;
		                  
		for(int i=0;i<10;i++)
{
			n[i]=Integer.parseInt(args[i]);
}
		Arrays.sort(n);
System.out.println(n[9]);
x=n[9];
for(int j=0;j<9;j++)
{
	if(x==n[j])
	{
		
		q++;
	
	}
	else{
		continue;
	}
	
}
System.out.println(q);
	}

}
