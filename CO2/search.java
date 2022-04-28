package co2;
import java.util.*;
public class search {

	public static void main(String[] args) {
		int m,i,search,flag=0;
		int n[]=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		m=in.nextInt();
		System.out.println("enter the elements in an array: ");
		for(i=0;i<m;i++)
		{
			n[i]=in.nextInt();
		}
		for(i=0;i<m ;i++)
		{
			System.out.println(n[i]);
		}
		System.out.println("enter the element to be searched:");
		search=in.nextInt();
		for(i=0;i<m;i++)
		{
			if(search==n[i])
			{
				System.out.println("the searched element is:" +n[i]+"found at position" +i);
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("the searched element is not found");
		}
		

	}

}
