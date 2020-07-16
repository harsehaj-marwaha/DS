
import java.util.*;


public class optimisedbubbleesort {

	
public static void main(String[] a
rgs) {
	
	Scanner input= new Scanner (System.in);
	
	int n= input.nextInt();

 int [] a= new int[n];
	
boolean swap;
		
for(int i=0;i<n-1;i++)
	
	{   
			
swap=false;
			
for(int j=0 ;j<n-1-i;j++)
		
	{
		
		
if(a[j]>a[j+1])
			
	{

	int temp=a[j];

a[j]=a[j+1];

a[j+1]=temp;
	
swap=true;

}
		i
	}
			
			
if(swap==false)
	

		{

			
	break;
	
		
}

}

for(int i=0;i<n;i++)
		
{
			
System.out.print(a[i]+" ");

		
}
}

}