package exception;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		int n,i,sum=0;
		double avg;
		int m[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count of numbers");
		n=sc.nextInt();
		System.out.println("enter the numbers:");
		for(i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			try
			{
				if(m[i]>0)
				{
					sum +=m[i];
				}
				else {
					throw  new userException("negative numbers:"+m[i]);
				}
			}
			catch(userException e)
			{
				System.out.println(e.getMessage());
			}
		}
		 avg=sum/n;
		 System.out.println(" average is:"+avg);
		
	}

}
class userException extends Exception{

	public  userException(String s){
        super(s);

	}

}
