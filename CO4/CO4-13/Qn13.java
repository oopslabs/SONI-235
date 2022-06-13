package Co1;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Qn13 {

	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<>();
		Scanner sc=new Scanner(System.in);
		int str;
		System.out.println("enter the number");
		int s=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<s;i++)
		{
		    str=sc.nextInt();	
			p.add(str);
		}
		System.out.println("queue:"+p);
		System.out.println("peek:"+p.peek());
		System.out.println("polling:"+p.poll());
		System.out.println("queue:"+p);
	}

}
