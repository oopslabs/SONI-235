package Student;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		
		int m,n,i,max;
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of number:");
		m=in.nextInt();
		System.out.println("enter the  digits:");
		int a[]=new int [m];
		for(i=0;i<m;i++)
		{
			a[i]=in.nextInt();
		}
		for(i=0;i<m;i++)
		{
			System.out.println(a[i]);
		}
		max=a[0];
		for(i=0;i<m;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("the maximum number in the list is:"+max);
		
	}

}
