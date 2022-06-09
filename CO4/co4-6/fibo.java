package Mca235;
import java.util.*;
class fibonacci extends Thread {
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int a = 0; int b = 1;int next;
		System.out.println("enter the limit upto the fibonnacci series:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(a+",");
			  next= a + b;
		      a = b;
		      b = next;
		}
	}


}
class even extends Thread {
	public  void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit for even numbers:");
		int m=sc.nextInt();
		for(int num=1;num<=m;num++)
		{
			 if(num%2==0)
			 {
				 System.out.println("the even number is:"+num);
			 }
		}
		

	}
}

public class fibo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		fibonacci obj1=new fibonacci();
		obj1.run();
		even obj2=new even();
		obj2.run();
		
	}

}
