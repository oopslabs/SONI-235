package exception;
import java.util.*;
class mul extends Thread {
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("5*"+i +"="+5*i);
		}
	}


}
class prime extends Thread {
		int count;
	public  void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit for prime numbers:");
		int m=sc.nextInt();
		for(int number=1;number<=m;number++)
		{
			 int count=0;
			for(int i=2;i<number/2;i++)
			
			{
				if(number%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && number!=1)
			{
				System.out.println("the prime numbers are:" +number );
			}
		}
		

	}
}

public class Threads {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		mul obj1=new mul();
		obj1.run();
		prime obj2=new prime();
		obj2.run();
		

	}

}
